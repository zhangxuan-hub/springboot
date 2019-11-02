package com.zx.springbootweb.config;

import com.zx.springbootweb.component.LoginInterceptor;
import com.zx.springbootweb.component.MyLocaleResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ResourceUtils;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.*;

/**
 * @创建人 张绚
 * @创建时间 2019/10/29 0029
 * @描述
 */

@Configuration
public class MyConfig implements WebMvcConfigurer {

    @Autowired
    private MyLocaleResolver localeResolver;
    @Autowired
    private LoginInterceptor interceptor;

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login.html").setViewName("index");
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/main.html").setViewName("dashboard");
    }

    @Bean
    public LocaleResolver localeResolver() {
        return localeResolver;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        /**
         * 因为我们的静态文件都是放在static文件夹下面的,但是我们去访问这些静态资源的时候在url中是不会通过/static请求的,
         * 而是直接通过/css、/img或/js访问的.
         * 因此我们需要做的就是将这些拦截排除掉或者将存放这些文件夹的文件夹排除掉即可,和/static是没有关系的
         **/
//        registry.addInterceptor(interceptor).addPathPatterns("/**").
//                excludePathPatterns("/", "/login.html", "/user/login", "/asserts/**");
    }
}
