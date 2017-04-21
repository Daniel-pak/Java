package com.company;

import java.util.*;

public class Main {

    private static List<Album> albums = new ArrayList<>();

    public static void main(String[] args) {

        Album album = new Album("Stormbringer", "Deep Purple");
        album.addSong("Stormbringer", 4.6);
        album.addSong("Soldier of Fortune", 4.3);
        album.addSong("You can't do it right", 4.2);
        album.addSong("Lady double dealer", 4.1);
        album.addSong("High Ball Shooter", 4.8);
        album.addSong("The Gypsy", 4.7);

        albums.add(album);

        album = new Album("For those about to rock", "AC/DC");
        album.addSong("For those about to rock", 5.44);
        album.addSong("Lets go", 8.25);
        album.addSong("Inject the venom", 4.51);
        album.addSong("Breaking the rules", 5.24);
        albums.add(album);

        List<Song> playlist = new Vector<>();
        albums.get(0).addToPlayList("You can't do it right", playlist);
        albums.get(0).addToPlayList("Soldier of Fortune", playlist);
        albums.get(0).addToPlayList("The Gypsy", playlist);
        albums.get(0).addToPlayList(5, playlist);

        albums.get(1).addToPlayList("For those about to rock", playlist);
        albums.get(1).addToPlayList(2, playlist);

        play(playlist);
    }

    private static void play(List<Song> playlist) {

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> iterator = playlist.listIterator();
        if (playlist.size() == 0) {
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing " + iterator.next().toString());
        }
        printMenu();
        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Playlist complete");
                    quit = true;
                    break;
                case 1:
                    if (!forward) {
                        if (iterator.hasNext()) {
                            iterator.next();
                        }
                        forward = true;
                    }
                    if (iterator.hasNext()) {
                        System.out.println("Now playing " + iterator.next().toString());
                    } else {
                        System.out.println("End of playlist");
                        forward = false;
                    }
                    break;
                case 2:
                    if (forward) {
                        if (iterator.hasPrevious()) {
                            iterator.previous();
                            forward = false;
                        }
                        if (iterator.hasPrevious()) {
                            System.out.println("Now playing " + iterator.previous().toString());
                        } else {
                            System.out.println("Start of the playlist");
                            forward = true;
                        }
                    }
                    break;
                case 3:
                    if (forward) {
                        if (iterator.hasPrevious()) {
                            System.out.println("Replaying " + iterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("You are at the start of the list");
                        }
                    } else {
                        if (iterator.hasNext()) {
                            System.out.println("Now replaying " + iterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("Reached end of the list");
                        }
                    }
                    break;
                case 4:
                    printList(playlist);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if (playlist.size() >0) {
                        iterator.remove();
                        if (iterator.hasNext()){
                            System.out.println("Now playing " + iterator.next().toString());
                        } else if (iterator.hasPrevious()){
                            System.out.println("Now playing " + iterator.previous().toString());
                        }
                    }
                    break;
            }
        }

    }

    private static void printList(List<Song> playlist) {
        Iterator<Song> iterator = playlist.iterator();
        System.out.println("=======================");
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
        System.out.println("=======================");
    }

    private static void printMenu() {
        System.out.println("Options: ");
        System.out.println("0 - quit");
        System.out.println("1 - next song");
        System.out.println("2 - previous song");
        System.out.println("3 - replay current song");
        System.out.println("4 - list songs");
        System.out.println("5 - print menu");
        System.out.println("6 - delete current song from playlist");
    }


}
