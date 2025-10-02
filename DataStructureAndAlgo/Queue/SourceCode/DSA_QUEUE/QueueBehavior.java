package DSA_QUEUE;

public class QueueBehavior {
    private final Object[] queue;
    private int front;
    private int rear;
    private int size;

    public QueueBehavior(int capacity) {
        this.queue = new Object[capacity];
        this.front = 0;
        this.rear = 0;
        this.size = 0;
    }

    public boolean add(Object element) {
        if (isFull()) {
            return false;
        }
        queue[rear] = element;
        rear = rear + 1;
        if (rear == queue.length) rear = 0;
        size++;
        return true;
    }

    public Object remove() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        Object removed = queue[front];
        queue[front] = null;
        front = front + 1;
        if (front == queue.length) front = 0;
        size--;
        return removed;
    }

    public Object peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue[front];
    }

    public Object poll() {
        if (isEmpty()) return null;

        Object removed = queue[front];
        queue[front] = null;
        front = front + 1;
        if (front == queue.length) front = 0;
        size--;
        return removed;
    }


    public boolean isFull() {
        return size == queue.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}
