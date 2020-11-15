package com.michael.quickstart.controller;

import com.michael.quickstart.dao.AccountDao;
import com.michael.quickstart.model.Account;

import javax.servlet.http.HttpServletRequest;

/**
 * description:
 *
 * @author Michael
 * @date 2020/11/15
 * @time 10:01 下午
 */
public class AccountLoginController {
    private final AccountDao accountDao;

    public AccountLoginController(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public String login(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        try {
            Account account = accountDao.findAccount(username, password);
            if (account == null) {
                return "/login";
            } else {
                return "/index";
            }
        } catch (Exception e) {
            return "/505";
        }
    }
}
