package com.company;

/**
 * Created by danielpak on 4/19/17.
 */
public class Song {
    private String name;
    private String duration;

    public Song(String name, String duration) {
        this.name = name;
        this.duration = duration;
    }

    public String getName() {
        return name;
    }

    public String getDuration() {
        return duration;
    }
}
