package com.lcc.datasource;

/**
 * Created by lcc on 2016/11/22.
 */
public enum  DataSources {
    MASTER("db-master"),
    LOG("db-log");

    private String key;

    DataSources(String key) {
        this.key = key;
    }

    public String key() {
        return key;
    }

    public String getKey() {
        return key;
    }
}
