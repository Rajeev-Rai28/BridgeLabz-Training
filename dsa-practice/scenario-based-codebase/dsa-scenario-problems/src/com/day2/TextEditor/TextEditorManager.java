package com.day2.TextEditor;

import java.util.Stack;

public class TextEditorManager {

    private StringBuilder content;
    private Stack<Action> undoStack;
    private Stack<Action> redoStack;

    public TextEditorManager() {
        content = new StringBuilder();
        undoStack = new Stack<>();
        redoStack = new Stack<>();
    }

    // Insert text
    public void insert(String text) {
        content.append(text);

        undoStack.push(new Action("INSERT", text));
        redoStack.clear();

        System.out.println("Inserted: " + text);
        showContent();
    }

    // Delete last n characters
    public void delete(int length) {
        if (length > content.length()) {
            length = content.length();
        }

        String deletedText = content.substring(content.length() - length);
        content.delete(content.length() - length, content.length());

        undoStack.push(new Action("DELETE", deletedText));
        redoStack.clear();

        System.out.println("Deleted: " + deletedText);
        showContent();
    }

    // Undo last action
    public void undo() {
        if (undoStack.isEmpty()) {
            System.out.println("Nothing to undo");
            return;
        }

        Action lastAction = undoStack.pop();

        if (lastAction.type.equals("INSERT")) {
            int len = lastAction.text.length();
            content.delete(content.length() - len, content.length());
            redoStack.push(lastAction);
        }
        else if (lastAction.type.equals("DELETE")) {
            content.append(lastAction.text);
            redoStack.push(lastAction);
        }

        System.out.println("Undo performed");
        showContent();
    }

    // Redo last undone action
    public void redo() {
        if (redoStack.isEmpty()) {
            System.out.println("Nothing to redo");
            return;
        }

        Action action = redoStack.pop();

        if (action.type.equals("INSERT")) {
            content.append(action.text);
            undoStack.push(action);
        }
        else if (action.type.equals("DELETE")) {
            int len = action.text.length();
            content.delete(content.length() - len, content.length());
            undoStack.push(action);
        }

        System.out.println("Redo performed");
        showContent();
    }

    // Show current content
    public void showContent() {
        System.out.println("Current Text: " + content.toString());
    }
}


