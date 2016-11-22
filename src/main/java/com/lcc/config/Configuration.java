package com.lcc.config;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by lcc on 2016/11/21.
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Configuration {

    private String k;

    private String v;

    private String operator;

    private String comment;

    public Configuration(String k, String v, String operator, String comment) {
        this.k = k;
        this.v = v;
        this.operator = operator;
        this.comment = comment;
    }
}
