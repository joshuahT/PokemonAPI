package com.reactandspring.app;

public class Pokemon {
    private int id;
    private String name;
    private String URL;

    public Pokemon(int id, String name, String URL){
        this.id = id;
        this.name = name;
        this.URL = URL;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }
}
