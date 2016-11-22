package com.lcc.bean;


import com.google.common.collect.Lists;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;
import java.util.List;
/**
 * Created by lcc on 2016/11/21.
 */

@ToString
public class PageResult<T> {

    private List<T> data = Lists.newArrayList();

    private int total = 0;

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public PageResult(List<T> data, int total) {
        this.data = data;
        this.total = total;
    }

    public static class Builder<T> {

        private int total;

        private List<T> data;

        public Builder data(List<T> data) {
            this.data = data;
            return this;
        }

        public Builder total(int total) {
            this.total = total;
            return this;
        }

        public PageResult build() {
            return new PageResult(data, total);
        }

    }
}
