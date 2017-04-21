package com.company;

import java.util.ArrayList;

/**
 * Created by danielpak on 4/19/17.
 */
public class Album {
    private String name;
    private ArrayList<Song> album;


    public Album(String name){
        this.name = name;
        this.album = new ArrayList<>();
    }

    public void addSongToAlbum(String name, String duration) {
        this.album.add(new Song(name, duration));
        System.out.println("Song added");
    }

    public void printSongsInAlbum(){
        for(int i = 0; i < this.album.size(); i++){
            Song song = this.album.get(i);
            System.out.print(i + 1 + ". " + song.getName() + " " + song.getDuration());
        }
    }

    public Song returnSong(String name) {
        for (int i = 0; i < this.album.size(); i++){
            if (this.album.get(i).getName().equals(name)){
                return this.album.get(i);
            }
        }
        return null;
    }

}
