package com.lcc.common;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
/**
 * Created by lcc on 2016/11/22.
 */
@Slf4j
public class SpringHelper {
    private static ApplicationContext applicationContext;

    public static void setApplicationContext(ApplicationContext applicationContext){
        SpringHelper.applicationContext = applicationContext;
    }

    public static <T> T popBean(Class<T> clazz){
        if (applicationContext == null){
            return null;
        }
        return  applicationContext.getBean(clazz);
    }

    public static <T> T popBean(String name,Class<T> clazz){
        if (applicationContext == null){
            return  null;
        }
        return  applicationContext.getBean(name,clazz);
    }
}
