package com.day8.GameBox;

public class GameBoxApp {

    public static void main(String[] args) {

        Game arcade = new ArcadeGame("Speed Racer", 300, 4.5);
        Game strategy = new StrategyGame("War Tactics", 500, 4.8);

        arcade.playDemo();
        strategy.playDemo();

        strategy.applyDiscount(20);

        User user = new User("Ayush");

        arcade.download();
        strategy.download();

        user.buyGame(arcade);
        user.buyGame(strategy);

        user.showLibrary();
    }
}
