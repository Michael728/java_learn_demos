package com.michael.quickstart.controller;

import com.michael.quickstart.dao.AccountDao;
import com.michael.quickstart.model.Account;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import javax.servlet.http.HttpServletRequest;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

/**
 * description:
 *
 * @author Michael
 * @date 2020/11/15
 * @time 10:22 下午
 */
@RunWith(MockitoJUnitRunner.class)
public class AccountLoginControllerTest {

    private AccountDao accountDao;
    private HttpServletRequest request;
    private AccountLoginController accountLoginController;

    @Before
    public void setUp() {
        // 需要 Mock 的对象，不用真正去查询数据库，dao 对象的替身
        this.accountDao = Mockito.mock(AccountDao.class);
        // Mock 一个 request 对象，也就是 request 的替身
        this.request = Mockito.mock(HttpServletRequest.class);
        // 初始化 Controller 对象
        this.accountLoginController = new AccountLoginController(accountDao);
    }

    @Test
    public void testLoginSuccess() {
        Account account = new Account();
        when(request.getParameter("username")).thenReturn("alex");
        when(request.getParameter("password")).thenReturn("123");
        when(accountDao.findAccount(anyString(), anyString())).thenReturn(account);
        String result = accountLoginController.login(request);
        // 断言
        assertThat(result, equalTo("/index"));
    }

    @Test
    public void testLoginFailure() {
        when(request.getParameter("username")).thenReturn("alex");
        when(request.getParameter("password")).thenReturn("1231");
        when(accountDao.findAccount(anyString(), anyString())).thenReturn(null);
        String result = accountLoginController.login(request);
        // 断言
        assertEquals(result, "/login");
    }


    @Test
    public void testLogin505() {
        when(request.getParameter("username")).thenReturn("alex");
        when(request.getParameter("password")).thenReturn("123");
        when(accountDao.findAccount(anyString(), anyString())).thenThrow(UnsupportedOperationException.class);
        // 断言
        assertThat(accountLoginController.login(request), equalTo("/505"));
    }
}
