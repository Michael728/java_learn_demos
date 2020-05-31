package oop;

/**
 * description:
 *
 * @author Michael
 * @date 2020/3/9
 * @time 9:00 下午
 */
public class Outer {
  class Inner{
      private int id;
      public void say(){
          System.out.println("say outer");
      }
      public void in(){
          System.out.println("inner class");
      }
  }
}
