package com.day1.BrowserBuddy;

public class BrowserBuddyApp {

    public static void main(String[] args) {

        BrowserTab tab = new BrowserTab("google.com");

        tab.visit("youtube.com");
        tab.visit("github.com");
        tab.visit("stackoverflow.com");

        tab.back();      // github
        tab.back();      // youtube

        tab.forward();   // github

        tab.closeTab();  // close github

        tab.reopenClosedTab(); // reopen github

        tab.showCurrentPage();

        System.out.println();
        tab.showFullHistory();
    }
}

