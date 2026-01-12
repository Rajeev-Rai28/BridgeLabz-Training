package com.day2.TextEditor;

public class TextEditorApp {

    public static void main(String[] args) {

        TextEditorManager editor = new TextEditorManager();

        editor.insert("Hello");
        editor.insert(" World");
        editor.insert(" Java");

        editor.delete(5);

        editor.undo();
        editor.undo();

        editor.redo();

        editor.insert(" Programming");

        editor.undo();
    }
}
