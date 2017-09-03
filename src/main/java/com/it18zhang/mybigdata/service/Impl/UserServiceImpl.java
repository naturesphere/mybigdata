package com.it18zhang.mybigdata.service.Impl;

/**
 * Created by xiebi on 5/17/2017.
 */
import java.util.List;

import com.it18zhang.mybigdata.dao.BaseDao;
import com.it18zhang.mybigdata.model.User;
import com.it18zhang.mybigdata.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service("userService")
@Transactional(isolation = Isolation.DEFAULT,propagation = Propagation.REQUIRED)
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {
    @Autowired
    private BaseDao dao;
    public void setDao() {
        super.setDao(dao);
    }

    @Override
    public User validateLoginInfo(String name, String password) {
        String hql="from User u where u.name=? and u.password=?";
        List<User> list=this.findByHQL(hql,name,password);
        if(list!=null&&!list.isEmpty()){
            return list.get(0);
        }
        return null;
    }
}
