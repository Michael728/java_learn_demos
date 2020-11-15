package io.charset;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;

/**
 * description:
 *
 * @author Michael
 * @date 2020/8/2
 * @time 5:09 下午
 */
public class CharsetTransform {
    public static void main(String[] args) throws Exception {
        Charset cn = Charset.forName("GBK");
        CharsetEncoder cnEncoder = cn.newEncoder();
        CharsetDecoder cnDecoder = cn.newDecoder();
        CharBuffer cbuff = CharBuffer.allocate(8);
        cbuff.put('孙');
        cbuff.put('悟');
        cbuff.put('空');
        cbuff.flip();
        ByteBuffer bbuff = cnEncoder.encode(cbuff);
        for (int i = 0; i < bbuff.capacity(); i++) {
            System.out.println(bbuff.get(i) + " ");
        }
        System.out.println("\r" + cnDecoder.decode(bbuff));
    }
}
