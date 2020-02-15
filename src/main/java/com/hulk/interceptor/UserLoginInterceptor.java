package com.hulk.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.hulk.cashbook.model.User;

/**
 * Created by Jacky on 2017/6/14.
 */
// wjq
public class UserLoginInterceptor extends HandlerInterceptorAdapter {
    public static final String DEFALLT_STRING = "sss";
    public boolean preHandle (HttpServletRequest request, HttpServletResponse response, Object handler) throws
            Exception{
        HttpSession session = request.getSession();
        User user = (User)session.getAttribute("userInfo");/*  fadfafd */
        if(user == null) {
            request.getRequestDispatcher("/common/403.jsp");
            return false;
        }
        return super.preHandle(request, response, handler);
    }

    public void add() {
        // master 上的代码
    }

}
