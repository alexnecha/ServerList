package com.levelUp.homework.dto;

import java.util.Date;

/**
 * Created by Sawa on 02.06.2017.
 */
public class Role {
    private String name; // admin,vip,player
    private int id;
    private Date dateStart;// дата выдачи admin,vip
    private Date dateEnd;

    public Role() {
    }

    public Role(String name, int id, Date dateStart, Date dateEnd) {
        this.name = name;
        this.id = id;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Role)) return false;

        Role role = (Role) o;

        return id == role.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
