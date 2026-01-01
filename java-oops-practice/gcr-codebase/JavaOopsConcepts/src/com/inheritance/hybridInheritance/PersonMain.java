package com.inheritance.hybridInheritance;

public class PersonMain {
    public static void main(String[] args) {

        Chef chef = new Chef("Amit", 101);
        Waiter waiter = new Waiter("Rohit", 102);

        chef.displayInfo();
        chef.performDuties();

        System.out.println();

        waiter.displayInfo();
        waiter.performDuties();
    }
}
