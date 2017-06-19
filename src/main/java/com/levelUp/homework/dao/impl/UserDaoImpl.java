package com.levelUp.homework.dao.impl;

import com.levelUp.homework.dao.IUserDao;
import com.levelUp.homework.dao.JDBCUtill;
import com.levelUp.homework.dto.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Sawa on 13.06.2017.
 */
public class UserDaoImpl implements IUserDao {
    @Override
    public void create(User user) throws SQLException {
        try (
                Connection connection = JDBCUtill.getConnection();
                PreparedStatement ps = connection.prepareStatement("INSERT INTO USERS ( email,skype,registration, last_visit " + "login, password, server_id)" + "VALUES" + "(?,?,?,?,?,?,?)", Statement.RETURN_GENERATED_KEYS)
        ) {
            ps.setString(1, user.getLogin());
            ps.setInt(2, user.getPassword());

        }

    }

    @Override
    public User read(int id) throws SQLException {
        return null;
    }

    @Override
    public boolean update(User contact) throws SQLException {
        return false;
    }

    @Override
    public boolean delete(User contact) throws SQLException {
        return false;
    }
}
