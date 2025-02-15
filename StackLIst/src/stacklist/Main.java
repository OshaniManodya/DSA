/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stacklist;



/**
 *
 * @author User
 */
public class Main {

    public static void main(String[] args) {
        // Creating a stack
        Stack stack = new Stack();

        // Push elements onto the stack
        stack.push(11);
        stack.push(22);
        stack.push(33);
        stack.push(44);

        // Print top element of the stack
        System.out.println("Top element is " + stack.peek());

        // Removing two elements from the top
        System.out.println("Removing two elements...");
        stack.pop();
        stack.pop();

        // Print top element of the stack
        System.out.println("Top element is " + stack.peek());
    }
}

    

