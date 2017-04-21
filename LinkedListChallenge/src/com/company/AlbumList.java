package com.company;

import java.util.ArrayList;

/**
 * Created by danielpak on 4/19/17.
 */
public class AlbumList {
    private ArrayList<Album> albumList;
    private String name;

    public AlbumList(String name) {
        this.albumList = new ArrayList<>();
        this.name = name;
    }

    public void addAlbum(Album album) {
        this.albumList.add(album);
        System.out.println("Album added");
    }

    public ArrayList<Album> getAlbumList() {
        return albumList;
    }

    public String getName() {
        return name;
    }

    public Album findAlbum(int position){
        return this.albumList.get(position - 1);
    }

    public void listAlbums(){
        for(int i = 0; i< this.albumList.size(); i++){
            System.out.println();
        }
    }
}
