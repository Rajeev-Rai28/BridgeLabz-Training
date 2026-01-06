package com.linkedList.DoublyLinkedList.UndoRedoFunctionalityforTextEditor;

public class UndoRedoTextEditor {

    public static void main(String[] args) {

        TextEditor editor = new TextEditor();

        editor.addState("Hello");
        editor.addState("Hello World");
        editor.addState("Hello World!");
        editor.addState("Hello World! Welcome");

        editor.showCurrentState();

        System.out.println("\nUndo:");
        editor.undo();
        editor.showCurrentState();

        System.out.println("\nUndo:");
        editor.undo();
        editor.showCurrentState();

        System.out.println("\nRedo:");
        editor.redo();
        editor.showCurrentState();

        System.out.println("\nNew Text After Undo (Redo Cleared):");
        editor.addState("Hello Java");
        editor.showCurrentState();

        System.out.println("\nRedo Attempt:");
        editor.redo();
    }
}