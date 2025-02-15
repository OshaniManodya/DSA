/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraycbt;

import java.util.Scanner;


public class ArrayCBTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the capacity of the binary tree: ");
        int capacity = scanner.nextInt();
        
        ArrayCBTest01 tree = new ArrayCBTest01(capacity);
        
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Insert a node");
            System.out.println("2. Get root");
            System.out.println("3. Get left child");
            System.out.println("4. Get right child");
            System.out.println("5. Get parent");
            System.out.println("6. Delete a node");
            System.out.println("7. Display tree");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    int value = scanner.nextInt();
                    try {
                        tree.insert(value);
                        System.out.println("Inserted " + value);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        System.out.println("Root: " + tree.getRoot());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.print("Enter value to find left child: ");
                    value = scanner.nextInt();
                    try {
                        System.out.println("Left child: " + tree.getLeftChild(value));
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 4:
                    System.out.print("Enter value to find right child: ");
                    value = scanner.nextInt();
                    try {
                        System.out.println("Right child: " + tree.getRightChild(value));
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    System.out.print("Enter value to find parent: ");
                    value = scanner.nextInt();
                    try {
                        System.out.println("Parent: " + tree.getparent(value));
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 6:
                    System.out.print("Enter value to delete: ");
                    value = scanner.nextInt();
                    try {
                        tree.delete(value);
                        System.out.println("Deleted " + value);
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 7:
                    System.out.println("Tree: " + tree);
                    break;
                case 8:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
