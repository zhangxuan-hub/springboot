package com.zx.springbootweb.component;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @创建人 张绚
 * @创建时间 2019/10/29 0029
 * @描述
 */

@Component
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object o = request.getSession().getAttribute("loginUser");
        if (o == null) {
            request.setAttribute("msg", "没有权限,请先登陆！");
            request.getRequestDispatcher("/login.html").forward(request, response);
            return false;
        }else {
            return true;
        }
    }
}
