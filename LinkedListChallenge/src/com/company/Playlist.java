package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by danielpak on 4/19/17.
 */
public class Playlist {
    private LinkedList<Song> playlist;
    private String name;

    public void addSongsToPlaylist(){
        this.playlist.add()
    }

    public Playlist(String name) {
        this.playlist = new LinkedList<>();
        this.name = name;
    }

    public void playlistOptions(){
        boolean running = true;
        while(running == true){
            options();
            optionOutput(menu());
        }
    }

    private void options() {
        System.out.println("Please choose an option: ");
        System.out.println("1. Search for a song to add to your playlist");
        System.out.println("2. Remove a song from your playlist");
        System.out.println("3. Play songs from your playlist");
        System.out.println("4. List songs from your playlist");
        System.out.println("5. Quit");
    }

    private int menu() {
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }

    private void playOptions() {
        System.out.println("1. Next");
        System.out.println("2. Repeat");
        System.out.println("3. Previous");
    }

    private boolean optionOutput(int optionNumber){
        switch(optionNumber){
            case 1:
                //
                break;
            case 2:
                //remove
                break;
            case 3:
                playOptions();
                break;
            case 4:
                //list songs on playlist
                break;
            case 5:
                return false;
        }
        return true;
    }

    public


}
