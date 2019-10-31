package com.zx.springbootweb.component;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * @创建人 张绚
 * @创建时间 2019/10/29 0029
 * @描述
 */

@Component
public class MyLocaleResolver implements LocaleResolver {
    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        Locale locale = null;
        locale = Locale.getDefault();

        String params = request.getParameter("l");
        if (!StringUtils.isEmpty(params)) {
            String[] split = params.split("_");
            locale = new Locale(split[0], split[1]);
        }

        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {

    }
}
