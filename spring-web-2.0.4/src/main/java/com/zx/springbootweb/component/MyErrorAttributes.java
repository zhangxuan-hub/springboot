package com.zx.springbootweb.component;

import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;

/**
 * @创建人 张绚
 * @创建时间 2019/11/4 0004
 * @描述 给容器中加入自己定义的ErrorAttributes
 */

@Component
public class MyErrorAttributes extends DefaultErrorAttributes {

    @Override
    public Map<String, Object> getErrorAttributes(WebRequest webRequest, boolean includeStackTrace) {
        //封装在map中的数据，就是在页面中通过json能够获取的数据
        Map<String, Object> map = super.getErrorAttributes(webRequest, includeStackTrace);
        map.put("company", "zhangxuan");
        Map<String, Object> ext = (Map<String, Object>)webRequest.getAttribute("ext", 0);
        map.put("ext", ext);

        return map;
    }
}
