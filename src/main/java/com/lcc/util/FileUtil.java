package com.lcc.util;

import lombok.extern.slf4j.Slf4j;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.net.URL;
import java.net.URL;


/**
 * Created by lcc on 2016/11/20.
 */
@Slf4j
public class FileUtil {

    //读取
    public static String readFile(URL url) throws Exception{
        BufferedReader br = null;
        try{
            File file = new File(url.toURI());
            br = new BufferedReader(new FileReader(file));
            StringBuffer sb = new StringBuffer();
            String line = null;

            while ((line = br.readLine()) != null) {
                sb.append(line);
            }

            return sb.toString();
        }catch (Exception e){
            throw  e;
        }finally {
            if (br != null){
                br.close();
            }
        }
    }
}
