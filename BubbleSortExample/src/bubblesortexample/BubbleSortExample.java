/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bubblesortexample;

import java.util.Scanner;
import java.util.Arrays;
public class BubbleSortExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int number[] = new int[] {76,6,107,92,21,23,5,9,8,8143};

       System.out.println("Unsorted array: "+Arrays.toString(number));
       int i;
       int j;
       int n=number.length;

       for(i=0;i<n-1;i++)
       {
        for(j=0;j<n-i-1;j++)
        {
           if(number[j]>number[j+1])
           {
            int swap=number[j];
            number[j]=number[j+1];
            number[j+1]=swap;

           }
           System.out.println("i=" + (i+1) +" ; j="  +(j+1)+Arrays.toString(number));
        }
        
       }
       System.out.println("Sorted array: "+Arrays.toString(number));

    }
    
}
