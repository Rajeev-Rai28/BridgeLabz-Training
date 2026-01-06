package com.linkedList.CircularLinkedList.TaskScheduler;

class TaskScheduler {

    private TaskNode head;
    private TaskNode current;

    // Add at beginning
    public void addAtBeginning(int id, String name, int priority, String date) {
        TaskNode node = new TaskNode(id, name, priority, date);

        if (head == null) {
            head = node;
            node.next = head;
            current = head;
            return;
        }

        TaskNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        node.next = head;
        temp.next = node;
        head = node;
    }

    // Add at end
    public void addAtEnd(int id, String name, int priority, String date) {
        TaskNode node = new TaskNode(id, name, priority, date);

        if (head == null) {
            head = node;
            node.next = head;
            current = head;
            return;
        }

        TaskNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = node;
        node.next = head;
    }

    // Add at specific position (1-based)
    public void addAtPosition(int pos, int id, String name, int priority, String date) {
        if (pos <= 0) {
            System.out.println("Invalid position");
            return;
        }

        if (pos == 1) {
            addAtBeginning(id, name, priority, date);
            return;
        }

        TaskNode temp = head;
        for (int i = 1; i < pos - 1 && temp.next != head; i++) {
            temp = temp.next;
        }

        TaskNode node = new TaskNode(id, name, priority, date);
        node.next = temp.next;
        temp.next = node;
    }

    // Remove task by ID
    public void removeById(int id) {
        if (head == null) {
            System.out.println("No tasks available");
            return;
        }

        TaskNode curr = head, prev = null;

        do {
            if (curr.taskId == id) {

                if (curr == head && curr.next == head) {
                    head = current = null;
                    return;
                }

                if (curr == head) {
                    TaskNode temp = head;
                    while (temp.next != head) {
                        temp = temp.next;
                    }
                    head = head.next;
                    temp.next = head;
                    current = head;
                } else {
                    prev.next = curr.next;
                    if (curr == current)
                        current = curr.next;
                }

                System.out.println("Task removed");
                return;
            }

            prev = curr;
            curr = curr.next;
        } while (curr != head);

        System.out.println("Task not found");
    }

    // View current task and move to next
    public void viewNextTask() {
        if (current == null) {
            System.out.println("No tasks available");
            return;
        }

        printTask(current);
        current = current.next;
    }

    // Display all tasks
    public void displayAll() {
        if (head == null) {
            System.out.println("No tasks available");
            return;
        }

        TaskNode temp = head;
        do {
            printTask(temp);
            temp = temp.next;
        } while (temp != head);
    }

    // Search by priority
    public void searchByPriority(int priority) {
        if (head == null) {
            System.out.println("No tasks available");
            return;
        }

        TaskNode temp = head;
        boolean found = false;

        do {
            if (temp.priority == priority) {
                printTask(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found) {
            System.out.println("No tasks with priority " + priority);
        }
    }

    private void printTask(TaskNode t) {
        System.out.println( "ID: " + t.taskId + ", Name: " + t.taskName + ", Priority: " + t.priority +", Due Date: " + t.dueDate);
    }
}
