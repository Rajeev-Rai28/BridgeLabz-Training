package com.linkedList.DoublyLinkedList.UndoRedoFunctionalityforTextEditor;

class TextEditor {

    private TextState head;
    private TextState tail;
    private TextState current;

    private int size = 0;
    private final int MAX_HISTORY = 10;

    // Add new state
    public void addState(String content) {
        TextState newState = new TextState(content);

        // If undo was used, clear redo history
        if (current != tail) {
            TextState temp = current.next;
            while (temp != null) {
                TextState next = temp.next;
                temp.prev = temp.next = null;
                temp = next;
                size--;
            }
            current.next = null;
            tail = current;
        }

        if (head == null) {
            head = tail = current = newState;
            size = 1;
            return;
        }

        tail.next = newState;
        newState.prev = tail;
        tail = newState;
        current = newState;
        size++;

        // Maintain max history size
        if (size > MAX_HISTORY) {
            head = head.next;
            head.prev = null;
            size--;
        }
    }

    // Undo operation
    public void undo() {
        if (current != null && current.prev != null) {
            current = current.prev;
        } else {
            System.out.println("Nothing to undo");
        }
    }

    // Redo operation
    public void redo() {
        if (current != null && current.next != null) {
            current = current.next;
        } else {
            System.out.println("Nothing to redo");
        }
    }

    // Display current state
    public void showCurrentState() {
        if (current != null) {
            System.out.println("Current Text: " + current.content);
        } else {
            System.out.println("Editor is empty");
        }
    }
}