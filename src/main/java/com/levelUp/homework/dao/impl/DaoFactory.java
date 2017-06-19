package com.levelUp.homework.dao.impl;

import com.levelUp.homework.dao.IRoleDao;
import com.levelUp.homework.dao.IUserDao;
import com.levelUp.homework.dto.BanList;

/**
 * Created by Sawa on 13.06.2017.
 */
public class DaoFactory {
    private static DaoFactory instanse;

    private IUserDao userDao;
    private IRoleDao roleDao;

    static {
        instanse = new DaoFactory();
    }

    public DaoFactory() {
    }
    public static DaoFactory getInstanse(){
        return instanse;
    }
    public IUserDao getUserDao() {
        if (userDao == null) {
            userDao = new UserDaoImpl();
        }
        return userDao;
    }

}
