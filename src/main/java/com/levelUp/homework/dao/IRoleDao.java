package com.levelUp.homework.dao;

import com.levelUp.homework.dto.Role;

/**
 * Created by Sawa on 13.06.2017.
 */
public interface IRoleDao {
    Role create(Role user);

    Role read(int id);

    boolean update(Role user);

    boolean delete(Role user);

}
