package com.linkedList.CircularLinkedList.RoundRobinSchedulingAlgorithm;

class ProcessNode {
    int pid;
    int burstTime;
    int remainingTime;
    int priority;

    int waitingTime = 0;
    int turnaroundTime = 0;

    ProcessNode next;

    public ProcessNode(int pid, int burstTime, int priority) {
        this.pid = pid;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.priority = priority;
        this.next = null;
    }
}
