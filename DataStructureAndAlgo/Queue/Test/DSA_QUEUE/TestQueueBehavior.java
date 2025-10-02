package DSA_QUEUE;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestQueueBehavior {
        @Test
        void testAddAndRemove() {
            QueueBehavior queue = new QueueBehavior(3);

            assertTrue(queue.add("A"));
            assertTrue(queue.add("B"));
            assertTrue(queue.add("C"));
            assertFalse(queue.add("D"));

            assertEquals(3, queue.size());
            assertTrue(queue.isFull());

            assertEquals("A", queue.remove());
            assertEquals("B", queue.remove());
            assertEquals(1, queue.size());

            assertFalse(queue.isFull());
            assertFalse(queue.isEmpty());
        }

        @Test
        void testPeek() {
            QueueBehavior queue = new QueueBehavior(2);

            queue.add("X");
            queue.add("Y");

            assertEquals("X", queue.peek());
            assertEquals(2, queue.size());
        }

        @Test
        void testPoll() {
            QueueBehavior queue = new QueueBehavior(2);

            assertNull(queue.poll());

            queue.add("A");
            queue.add("B");

            assertEquals("A", queue.poll());
            assertEquals("B", queue.poll());
            assertNull(queue.poll());
        }

        @Test
        void testRemoveThrowsWhenEmpty() {
            QueueBehavior queue = new QueueBehavior(2);

            assertThrows(IllegalStateException.class, queue::remove);

            queue.add("A");
            assertEquals("A", queue.remove());

            assertThrows(IllegalStateException.class, queue::remove);
        }

        @Test
        void testWrapAroundBehavior() {
            QueueBehavior queue = new QueueBehavior(3);

            queue.add("A");
            queue.add("B");
            queue.add("C");

            assertTrue(queue.isFull());
            assertEquals("A", queue.remove());
            assertTrue(queue.add("D"));

            assertEquals("B", queue.remove());
            assertEquals("C", queue.remove());
            assertEquals("D", queue.remove());

            assertTrue(queue.isEmpty());
        }
    }


