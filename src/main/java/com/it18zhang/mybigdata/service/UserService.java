package com.it18zhang.mybigdata.service;

import com.it18zhang.mybigdata.model.User;
/**
 * Created by xiebi on 5/17/2017.
 */

public interface UserService extends BaseService<User> {
    public User validateLoginInfo(String name,String password);
}
