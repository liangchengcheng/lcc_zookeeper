package com.lcc.shortUrl;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * Created by lcc on 2016/11/22.
 */

public class ShortUrl {

    private String origin;

    private String current;

    private int status;

    private Date createTime;

    private Date invalidTime;

    public ShortUrl(String origin, String current, int status, Date createTime, Date invalidTime) {
        this.origin = origin;
        this.current = current;
        this.status = status;
        this.createTime = createTime;
        this.invalidTime = invalidTime;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getCurrent() {
        return current;
    }

    public void setCurrent(String current) {
        this.current = current;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getInvalidTime() {
        return invalidTime;
    }

    public void setInvalidTime(Date invalidTime) {
        this.invalidTime = invalidTime;
    }

    public static class Builder {

        private String origin;

        private String current;

        private int status;

        private Date createTime;

        private Date invalidTime;

        public Builder origin(String origin) {
            this.origin = origin;
            return this;
        }

        public Builder current(String current) {
            this.current = current;
            return this;
        }

        public Builder status(int status) {
            this.status = status;
            return this;
        }

        public Builder createTime(Date createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder invalidTime(Date invalidTime) {
            this.invalidTime = invalidTime;
            return this;
        }

        public ShortUrl build() {
            return new ShortUrl(origin, current, status,createTime,invalidTime);
        }

    }
}

