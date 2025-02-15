/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraycbt;

import java.util.Arrays;
import java.util.Scanner;
public class ArrayCBTest01 {
    private Integer[] tree;
    private int size;
    
    //constructor to initialize the binary tree with a specific capacity
    public ArrayCBTest01(int capacity){
        tree = new Integer[capacity];
        size = 0;
    }
    //Add a node to the binary
    public void insert(int value){
        if (size == tree.length)
        {
            throw new IllegalStateException("Tree is full");
        }
        tree[size]=value;
        size++;
    }
    
    // get the value of the node 
    
    public int getRoot(){
        if(size==0)
        {
            throw new IllegalStateException("Tree is empty");
        }
        return tree[0];
    }
    public int getLeftChild(int value)
    {
        int index = search(value);
        int leftIndex = 2 * index +1;
        if(leftIndex >= size)
        {
            throw new IllegalStateException("Tree is empty");
        }
        return tree[leftIndex];
    }
    
    public int getRightChild(int value)
    {
        int index = search(value);
        int rightIndex = 2 * index +2;
        if(rightIndex >= size)
        {
            throw new IllegalStateException("Tree is empty");
        }
        return tree[rightIndex];
    }
    
    public int getparent(int value)
    {
        int index = search(value);
        if(index ==0)
        {
            throw new IllegalStateException("roo node has no parent");
        }
        int parentIndex = (index-1)/2;
        return tree[parentIndex];
    }
    //display the binery tree as an array using deepTOString 
    @Override
    public String toString(){
        return Arrays.deepToString(tree);
    }
    
    //delete a node from the binery tree
    public void delete(int value)
    {
        int index = search(value);
        if(index == -1)
        {
            throw new IllegalStateException("value is not found in the tree");
        }
        //replace the node to delete with the last node
        tree[index] = tree [size-1];
        size--;
    }
    
    //search for a specific node and return its index
    public int search(int value){
        for(int i=0; i <size; i++)
        {
            if(tree[i]==value)
            {
                return i;
            }
        }
        return -1;//vlaue not found
    }
    
    public int getNodeValue(int value)
    {
        int index = search (value);
        if(index == -1)
        {
            throw new IllegalStateException("value not found in the tree");
        }
        return tree[index];
    }
}
