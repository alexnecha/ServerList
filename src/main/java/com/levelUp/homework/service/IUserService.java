package com.levelUp.homework.service;

import com.levelUp.homework.dto.User;

import java.sql.SQLException;

/**
 * Created by Sawa on 13.06.2017.
 */
public interface IUserService {
    User findById(int id) throws SQLException;
    User add(User user) throws SQLException;
    boolean uddate(User user) throws SQLException;
    boolean delete(User user) throws  SQLException;
}
