package com.lcc.config;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Created by lcc on 2016/11/21.
 */

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

    public String getK() {
        return k;
    }

    public void setK(String k) {
        this.k = k;
    }

    public String getV() {
        return v;
    }

    public void setV(String v) {
        this.v = v;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
