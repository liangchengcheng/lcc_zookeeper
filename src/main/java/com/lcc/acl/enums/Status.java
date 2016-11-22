package com.lcc.acl.enums;

import lombok.Getter;

/**
 * Created by lcc on 2016/11/22.
 */

public enum  Status {

    AVAILABLE(1, "有效"),
    NOT_AVAILABLE(0, "无效"),
    DELETED(2, "删除");

    private int code;
    private String desc;

    Status(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
