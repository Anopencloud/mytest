/**
 * Copyright (C), 2015-2018, 风行世界有限公司
 * FileName: User
 * Author:   lenovo
 * Date:     2018/11/26 11:22
 * Description: 用户
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.shop.model;/**
 * Created by lenovo on 2018/11/26.
 */

import java.util.Date;

/**
 * 〈一句话功能简述〉<br> 
 * 〈用户〉
 *
 * @author lenovo
 * @create 2018/11/26
 * @since 1.0.0
 */
public class User {

    private long id;
    private String email;
    private String password;
    private String username;
    private String role;
    private int status;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getRegTime() {
        return regTime;
    }

    public void setRegTime(Date regTime) {
        this.regTime = regTime;
    }

    public String getRegIp() {
        return regIp;
    }

    public void setRegIp(String regIp) {
        this.regIp = regIp;
    }

    private Date regTime;
    private String regIp;
}