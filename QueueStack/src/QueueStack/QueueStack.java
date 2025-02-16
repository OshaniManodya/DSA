/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QueueStack;


import java.util.LinkedList;
import java.util.Queue;

public class QueueStack<T> {
    private Queue<T> queue1;
    private Queue<T> queue2;

    // Constructor
    public QueueStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    // Push an element onto the stack
    public void push(T element) {
        queue2.add(element);
        while (!queue1.isEmpty()) {
            queue2.add(queue1.remove());
        }
        Queue<T> temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    // Pop the top element from the stack
    public T pop() {
        if (queue1.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return queue1.remove();
    }

    // Peek at the top element without removing it
    public T peek() {
        if (queue1.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return queue1.peek();
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return queue1.isEmpty();
    }

    // Implement enqueue for queue operations
    public void enqueue(T element) {
        queue1.add(element);
    }

    // Implement dequeue for queue operations
    public T dequeue() {
        if (queue1.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue1.remove();
    }

    // Override toString() to display elements
    @Override
    public String toString() {
        return queue1.toString();
    }
}
