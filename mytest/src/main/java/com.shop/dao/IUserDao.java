package com.shop.dao;

import com.shop.model.User;

.

/**
 * Created by lenovo on 2018/11/26.
 */
public interface IUserDao {
    User selectUser(long id);
}
