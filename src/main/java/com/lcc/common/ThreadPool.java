package com.lcc.common;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by lcc on 2016/11/21.
 */
public class ThreadPool {
    //线程池
    private  static ExecutorService defaultExecutor;
    static {
        defaultExecutor = new ThreadPoolExecutor(GlobalConfig.getIntValue(GlobalConfigKey.DEFAULT_EXECUTOR_CORESIZE, 40),     // 核心池大小
                GlobalConfig.getIntValue(GlobalConfigKey.DEFAULT_EXECUTOR_MAXSIZE, 100),                                      // 最大线程数
                GlobalConfig.getIntValue(GlobalConfigKey.DEFAULT_EXECUTOR_KEEPALIVE_SECONDS, 120),                            // 空闲等待时间
                TimeUnit.SECONDS,                                                                                             // 时间单位
                new ArrayBlockingQueue<Runnable>(GlobalConfig.getIntValue(GlobalConfigKey.DEFAULT_EXECUTOR_QUEUESIZE, 1000)), // 循环数组 + 指定大小
                new ThreadPoolExecutor.DiscardOldestPolicy()                                                                  // 抛弃最早的请求
        );
    }
}
