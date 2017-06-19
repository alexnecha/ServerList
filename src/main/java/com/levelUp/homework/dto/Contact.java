package com.levelUp.homework.dto;

import java.util.Date;

/**
 * Created by Sawa on 02.06.2017.
 */

public class Contact {
    private String skype;
    private String email;
    private Date dateOfRegistration;
    private Date lastVisit;

    public Contact() {
    }

    public Contact(String skype, String email, Date dateOfRegistration, Date lastVisit) {
        this.skype = skype;
        this.email = email;
        this.dateOfRegistration = dateOfRegistration;
        this.lastVisit = lastVisit;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "skype='" + skype + '\'' +
                ", email='" + email + '\'' +
                ", dateOfRegistration=" + dateOfRegistration +
                '}';
    }

}
