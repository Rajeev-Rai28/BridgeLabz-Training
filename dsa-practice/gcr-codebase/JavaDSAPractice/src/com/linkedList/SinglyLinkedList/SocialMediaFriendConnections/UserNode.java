package com.linkedList.SinglyLinkedList.SocialMediaFriendConnections;

class UserNode {
    int userId;
    String name;
    int age;
    FriendNode friends;   // head of friend list
    UserNode next;

    public UserNode(int userId, String name, int age) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.friends = null;
        this.next = null;
    }
}