package com.day1.BrowserBuddy;

public class Page {
    String url;
    Page prev;
    Page next;

    public Page(String url) {
        this.url = url;
        this.prev = null;
        this.next = null;
    }
}
