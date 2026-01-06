package com.linkedList.SinglyLinkedList.SocialMediaFriendConnections;

public class SocialMediaSystem {

    public static void main(String[] args) {

        SocialMediaList sm = new SocialMediaList();

        sm.addUser(1, "Rajeev", 21);
        sm.addUser(2, "Rachit", 22);
        sm.addUser(3, "Abhi", 20);
        sm.addUser(4, "Shiv", 23);

        sm.addFriend(1, 2);
        sm.addFriend(1, 3);
        sm.addFriend(2, 3);
        sm.addFriend(2, 4);

        sm.displayFriends(1);
        sm.countFriends(2);

        System.out.println();
        sm.mutualFriends(1, 2);

        System.out.println();
        sm.removeFriend(1, 3);
        sm.displayFriends(1);

        System.out.println();
        sm.searchByName("shiv");
    }
}