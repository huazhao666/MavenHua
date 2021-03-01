package com.huazhao.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created with Intellij IDEA
 * Description:
 * User : 花朝
 * Date : 2020-12-15
 * Time : 11:46
 */
@WebServlet("/profile")
public class ProfileServlet  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(false);
        if(session == null){
            System.out.println("没登陆");
            return;
        }
        String name = (String)session.getAttribute("username");
        int age = (Integer) session.getAttribute("age");
        System.out.println(name);
        System.out.println(age);

    }
}
