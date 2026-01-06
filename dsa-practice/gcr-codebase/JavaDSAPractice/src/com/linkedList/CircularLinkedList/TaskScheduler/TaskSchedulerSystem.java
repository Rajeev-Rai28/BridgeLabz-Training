package com.linkedList.CircularLinkedList.TaskScheduler;

public class TaskSchedulerSystem {

    public static void main(String[] args) {

        TaskScheduler scheduler = new TaskScheduler();

        scheduler.addAtEnd(1, "Write Code", 1, "2026-01-10");
        scheduler.addAtEnd(2, "Test Program", 2, "2026-01-12");
        scheduler.addAtBeginning(3, "Design Logic", 1, "2026-01-08");
        scheduler.addAtPosition(2, 4, "Debug Issues", 3, "2026-01-11");

        System.out.println("All Tasks:");
        scheduler.displayAll();

        System.out.println("\nView Current & Next Tasks:");
        scheduler.viewNextTask();
        scheduler.viewNextTask();
        scheduler.viewNextTask();

        System.out.println("\nSearch by Priority (1):");
        scheduler.searchByPriority(1);

        System.out.println("\nRemove Task ID 2:");
        scheduler.removeById(2);

        System.out.println("\nFinal Task List:");
        scheduler.displayAll();
    }
}