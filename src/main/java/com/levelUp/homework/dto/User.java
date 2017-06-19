package com.levelUp.homework.dto;

import java.lang.management.GarbageCollectorMXBean;
import java.util.Date;

/**
 * Created by Sawa on 13.06.2017.
 */
public class User extends Contact {
    private int id;
    private String login;
    private int password;
    private Role role;
    private Game game;

    public User() {
    }

    public User(int id, String login, int password, Role role, Game game) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.role = role;
        this.game = game;
    }
    public User(String skype, String email, Date dateOfRegistration, Date lastVisit, int id, String login, int password, Role role, Game game) {
        super(skype, email, dateOfRegistration, lastVisit);
        this.id = id;
        this.login = login;
        this.password = password;
        this.role = role;
        this.game = game;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        return id == user.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
