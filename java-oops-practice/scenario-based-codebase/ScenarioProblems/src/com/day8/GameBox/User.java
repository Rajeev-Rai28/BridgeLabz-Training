package com.day8.GameBox;

import java.util.*;

class User {

    private String username;
    private List<Game> ownedGames;

    public User(String username) {
        this.username = username;
        this.ownedGames = new ArrayList<>();
    }

    public void buyGame(Game game) {
        ownedGames.add(game);
        System.out.println(username + " purchased " + game.title);
    }

    public void showLibrary() {
        System.out.println("🎮 " + username + "'s Game Library:");
        for (Game g : ownedGames) {
            System.out.println("- " + g.title + " | Price: " + g.getPrice());
        }
    }
}
