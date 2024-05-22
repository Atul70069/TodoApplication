package com.lcwd.first.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "lcwd.config")
@Component
public class LCWDconfig {

    private String name;
    private String password;
    private String email;
    private int emailExipreationTime;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEmailExipreationTime() {
        return emailExipreationTime;
    }

    public void setEmailExipreationTime(int emailExipreationTime) {
        this.emailExipreationTime = emailExipreationTime;
    }

    @Override
    public String toString() {
        return "LCWDconfig{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", emailExipreationTime=" + emailExipreationTime +
                '}';
    }
}
