package com.levelUp.homework.dao;

import com.levelUp.homework.dto.User;

import java.sql.SQLException;

/**
 * Created by Sawa on 13.06.2017.
 */
public interface IUserDao {
    void create(User user) throws SQLException;

    User read(int id) throws SQLException;

    boolean update(User user) throws SQLException;

    boolean delete(User user) throws SQLException;

}
