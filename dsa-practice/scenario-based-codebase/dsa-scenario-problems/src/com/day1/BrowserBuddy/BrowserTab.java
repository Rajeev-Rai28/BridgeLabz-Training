package com.day1.BrowserBuddy;

import java.util.Stack;

public class BrowserTab {

    private Page current;           // current page pointer
    private Stack<Page> closedTabs; // stack for closed tabs

    // Constructor
    public BrowserTab(String homePage) {
        current = new Page(homePage);
        closedTabs = new Stack<>();
        System.out.println("Opened: " + homePage);
    }

    // Visit new page
    public void visit(String url) {
        Page newPage = new Page(url);

        // Clear forward history (real browser behavior)
        current.next = null;

        // Connect current and new page
        current.next = newPage;
        newPage.prev = current;

        current = newPage; // move pointer
        System.out.println("Visited: " + url);
    }

    // Go Back
    public void back() {
        if (current.prev != null) {
            current = current.prev;
            System.out.println("Back to: " + current.url);
        } else {
            System.out.println("No previous page!");
        }
    }

    // Go Forward
    public void forward() {
        if (current.next != null) {
            current = current.next;
            System.out.println("Forward to: " + current.url);
        } else {
            System.out.println("No next page!");
        }
    }

    // Close current tab
    public void closeTab() {
        closedTabs.push(current);
        System.out.println("Closed tab: " + current.url);
    }

    // Reopen last closed tab
    public void reopenClosedTab() {
        if (!closedTabs.isEmpty()) {
            Page reopened = closedTabs.pop();
            current = reopened;
            System.out.println("Reopened tab: " + current.url);
        } else {
            System.out.println("No closed tabs to reopen!");
        }
    }

    // Show current page
    public void showCurrentPage() {
        System.out.println("Current Page: " + current.url);
    }

    // Show full history (optional, for debugging)
    public void showFullHistory() {
        Page temp = current;

        // Go to first page
        while (temp.prev != null) {
            temp = temp.prev;
        }

        System.out.println("Full Browser History:");
        while (temp != null) {
            System.out.println(" -> " + temp.url);
            temp = temp.next;
        }
    }
}

