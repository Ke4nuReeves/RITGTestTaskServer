package com.dmitriytitov.ritgtesttask.server.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * Created by Dmitriy Titov on 17.06.2017.
 */
@Entity
@Table(name = "Countries")
public class Country {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long id;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @Column(name = "capital", nullable = false, length = 50)
    private String capital;

    /*public Country(String name, String capital) {
        this.name = name;
        this.capital = capital;
    }*/

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public void setId(long id) {

        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }
}
