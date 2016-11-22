package com.lcc.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import java.util.Properties;
/**
 * Created by lcc on 2016/11/22.
 */
@Slf4j
public class PropertiesUtil {
    /****
     * 配置文件.
     */
    private static final String DEFAULT_PROP_FILE = "properties/default.properties";
    private static final String CONFIG_PROP_FILE = "properties/config.properties";

    private static Properties prop= new Properties();

    private PropertiesUtil(){

    }

    static {
        reload();
    }

    public static void reload(){
        try{
            Properties properties = new Properties();
            properties.load(PropertiesUtil.class.getClassLoader().getResourceAsStream(DEFAULT_PROP_FILE));
            properties.load(PropertiesUtil.class.getClassLoader().getResourceAsStream(CONFIG_PROP_FILE));
            prop = properties;
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static String get(String key) {
        if (StringUtils.isBlank(key)) {
            return "";
        }
        return String.valueOf(prop.get(key));
    }

    public static String get(String key, String defaultValue) {
        if (StringUtils.isBlank(key)) {
            return defaultValue;
        }
        return String.valueOf(prop.get(key));
    }

    public static void main(String[] args) {
        System.out.println(get("test"));
        System.out.println(get("isProd"));
    }
}
