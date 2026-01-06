package com.linkedList.CircularLinkedList.RoundRobinSchedulingAlgorithm;

class RoundRobinScheduler {

    private ProcessNode head = null;
    private int timeQuantum;

    public RoundRobinScheduler(int timeQuantum) {
        this.timeQuantum = timeQuantum;
    }

    // Add process at end
    public void addProcess(int pid, int burstTime, int priority) {
        ProcessNode node = new ProcessNode(pid, burstTime, priority);

        if (head == null) {
            head = node;
            node.next = head;
            return;
        }

        ProcessNode temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = node;
        node.next = head;
    }

    // Simulate Round Robin scheduling
    public void simulate() {
        if (head == null) {
            System.out.println("No processes available");
            return;
        }

        int currentTime = 0;
        ProcessNode curr = head;
        int processCount = countProcesses();

        System.out.println("---- Round Robin Execution ----");

        while (processCount > 0) {

            if (curr.remainingTime > 0) {

                int execTime = Math.min(timeQuantum, curr.remainingTime);
                curr.remainingTime -= execTime;
                currentTime += execTime;

                // Update waiting time for others
                updateWaitingTimes(curr, execTime);

                System.out.println(
                        "Process P" + curr.pid +
                        " executed for " + execTime +
                        " units (Remaining: " + curr.remainingTime + ")"
                );

                if (curr.remainingTime == 0) {
                    curr.turnaroundTime = currentTime;
                    processCount--;
                    removeProcess(curr.pid);
                    displayProcesses();
                }
            }

            curr = curr.next;
        }

        calculateAverages();
    }

    // Update waiting times
    private void updateWaitingTimes(ProcessNode current, int time) {
        ProcessNode temp = head;
        if (temp == null) return;

        do {
            if (temp != current && temp.remainingTime > 0) {
                temp.waitingTime += time;
            }
            temp = temp.next;
        } while (temp != head);
    }

    // Remove process by PID
    private void removeProcess(int pid) {
        if (head == null) return;

        ProcessNode curr = head, prev = null;

        do {
            if (curr.pid == pid) {

                if (curr == head && curr.next == head) {
                    head = null;
                    return;
                }

                if (curr == head) {
                    ProcessNode last = head;
                    while (last.next != head) {
                        last = last.next;
                    }
                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = curr.next;
                }
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);
    }

    // Display process list
    private void displayProcesses() {
        if (head == null) {
            System.out.println("Queue empty");
            return;
        }

        System.out.print("Queue: ");
        ProcessNode temp = head;
        do {
            System.out.print("P" + temp.pid + "(" + temp.remainingTime + ") ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }

    // Count processes
    private int countProcesses() {
        if (head == null) return 0;
        int count = 0;
        ProcessNode temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);
        return count;
    }

    // Calculate averages
    private void calculateAverages() {
        ProcessNode temp = head;
        double totalWT = 0, totalTAT = 0;
        int count = 0;

        System.out.println("\nFinal Statistics");

        if (temp == null) return;

        do {
            totalWT += temp.waitingTime;
            totalTAT += temp.turnaroundTime;
            count++;

            System.out.println("P" + temp.pid + " | WT: " + temp.waitingTime + " | TAT: " + temp.turnaroundTime);

            temp = temp.next;
        } while (temp != head);

        System.out.println("\nAverage Waiting Time: " + (totalWT / count));
        System.out.println("Average Turnaround Time: " + (totalTAT / count));
    }
}
