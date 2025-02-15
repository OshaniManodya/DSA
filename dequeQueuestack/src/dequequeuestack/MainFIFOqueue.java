/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dequequeuestack;


public class MainFIFOqueue {

    
    
    public static void main(String[] args) {
        // Create an instance of FIFOQueue
        FIFOQueue<Integer> queue = new FIFOQueue<>();

        // Add elements to the queue
        System.out.println("Enqueuing elements: 10, 20, 30");
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        
        // Display the queue
        System.out.println("Queue after enqueuing: " + queue);

        // Peek at the front element
        System.out.println("Front element (peek): " + queue.peek());

        // Dequeue elements
        System.out.println("Dequeuing elements...");
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Queue after dequeue: " + queue);

        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Queue after dequeue: " + queue);

        // Check if the queue is empty
        System.out.println("Is the queue empty? " + queue.isEmpty());

        // Dequeue the last element
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Queue after dequeue: " + queue);

        // Check if the queue is empty again
        System.out.println("Is the queue empty? " + queue.isEmpty());

        // Try dequeuing from an empty queue (should throw an exception)
        try {
            queue.dequeue();
        } catch (IllegalStateException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

    
    

