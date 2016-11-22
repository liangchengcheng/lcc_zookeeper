package com.lcc.config;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by lcc on 2016/11/22.
 */
@Slf4j
public class ThreadHelper {
    public static void safeSleep(long millseconds){
        try{
            Thread.currentThread().sleep(millseconds);
        }catch (Throwable t){
            //
        }
    }
}
