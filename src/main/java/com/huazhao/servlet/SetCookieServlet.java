package com.huazhao.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created with Intellij IDEA
 * Description:
 * User : 花朝
 * Date : 2020-12-15
 * Time : 10:08
 */
@WebServlet("/set-cookie")
public class SetCookieServlet  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
   //    resp.setHeader("Set-Cookie","k1=v1");
        Cookie cookie = new Cookie("k2","v2");
    //    cookie.setDomain("huazhao.com");
        cookie.setMaxAge(60);//60s后过期；不设置的话就是会话级别；
        resp.addCookie(cookie);

    }
}
