package com.levelUp.homework.service.impl;

import com.levelUp.homework.dto.User;
import com.levelUp.homework.service.IUserService;

import java.sql.SQLException;

/**
 * Created by Sawa on 13.06.2017.
 */
public class UserServiceImpl implements IUserService {
    @Override
    public User findById(int id) throws SQLException {
        return null;
    }

    @Override
    public User add(User user) throws SQLException {
        return null;
    }

    @Override
    public boolean uddate(User user) throws SQLException {
        return false;
    }

    @Override
    public boolean delete(User user) throws SQLException {
        return false;
    }
}
