package com.lcc.bean;

import lombok.Getter;
import lombok.AllArgsConstructor;
import lombok.Builder;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.Set;
/**
 * Created by lcc on 2016/11/21.
 */
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Mail {

    private Set<String> receivers; // 收件人的邮箱

    private String subject; // 主题

    private String message; // 信息(支持HTML)

    public Set<String> getReceivers() {
        return receivers;
    }

    public void setReceivers(Set<String> receivers) {
        this.receivers = receivers;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
