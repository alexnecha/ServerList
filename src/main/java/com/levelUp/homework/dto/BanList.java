package com.levelUp.homework.dto;

import java.util.Date;

/**
 * Created by Sawa on 13.06.2017.
 */
public class BanList {
    private User user;
    private Game game;
    private Server server;
    private Date dateStart;
    private Date dateEnd;

    public BanList(User user, Game game, Server server, Date dateStart, Date dateEnd) {
        this.user = user;
        this.game = game;
        this.server = server;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
    }
    @Override
    public String toString() {
        return "BanList{" +
                "user=" + user +
                ", game=" + game +
                ", server=" + server +
                ", dateStart=" + dateStart +
                ", dateEnd=" + dateEnd +
                '}';
    }
}
