/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bst;

/**
 *
 * @author User
 */
public class Node {
    int key;
    Node left,right;
    
    
    public Node(int item)
    {
        key = item;
        left = right = null;
    }
}