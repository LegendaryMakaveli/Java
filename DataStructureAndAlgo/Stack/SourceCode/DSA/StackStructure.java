package DSA;

public class StackStructure {
    private final int[] stack;
    private int top;

    public StackStructure(int capacity) {
        this.stack = new int[capacity];
        this.top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == stack.length - 1;
    }

    public void pushElement(int newElement) {
        if (isFull()) {
            throw new IllegalStateException("Stack is full");
        }
        stack[++top] = newElement;
    }

    public int popElement() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack[top--];
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack[top];
    }

    public int size() {
        return top + 1;
    }
}

