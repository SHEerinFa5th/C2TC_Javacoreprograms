package day16.queue;

import java.util.ArrayDeque;

public class UndoRedoFunctionality {
    public static void main(String[] args) {
        ArrayDeque<String> undoStack = new ArrayDeque<>();
        ArrayDeque<String> redoStack = new ArrayDeque<>();

        // Perform actions
        performAction("Type 'Hello'", undoStack, redoStack);
        performAction("Type 'World'", undoStack, redoStack);

        undo(undoStack, redoStack);
        undo(undoStack, redoStack);

        redo(undoStack, redoStack);
    }

    static void performAction(String action, ArrayDeque<String> undoStack, ArrayDeque<String> redoStack) {
        undoStack.push(action);
        redoStack.clear();
        System.out.println("Action performed: " + action);
    }

    static void undo(ArrayDeque<String> undoStack, ArrayDeque<String> redoStack) {
        if (!undoStack.isEmpty()) {
            String action = undoStack.pop();
            redoStack.push(action);
            System.out.println("Undo: " + action);
        } else {
            System.out.println("Nothing to undo");
        }
    }

    static void redo(ArrayDeque<String> undoStack, ArrayDeque<String> redoStack) {
        if (!redoStack.isEmpty()) {
            String action = redoStack.pop();
            undoStack.push(action);
            System.out.println("Redo: " + action);
        } else {
            System.out.println("Nothing to redo");
        }
    }
}
