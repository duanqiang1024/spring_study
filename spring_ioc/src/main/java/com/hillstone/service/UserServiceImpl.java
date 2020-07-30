package com.hillstone.service;

import com.hillstone.dao.UserDao;
import com.hillstone.dao.UserDaoImpl;
import com.hillstone.dao.UserDaoMysqlImpl;
import com.hillstone.dao.UserDaoOracleImpl;

public class UserServiceImpl implements UserService {

    //    private UserDao userDao = new UserDaoImpl();
   //    private UserDao userDao = new UserDaoMysqlImpl();
//    private UserDao userDao = new UserDaoOracleImpl();

    //开始控制反转
    private UserDao userDao;
    //利用SET进行动态实现值的动态注入！
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
