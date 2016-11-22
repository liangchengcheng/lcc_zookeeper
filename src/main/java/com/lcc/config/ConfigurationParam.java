package com.lcc.config;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.NotBlank;
/**
 * Created by lcc on 2016/11/21.
 */

@ToString
public class ConfigurationParam {
    @NotBlank(message = "key不允许为空")
    private String k;

    private String v;

    private String comment;

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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
