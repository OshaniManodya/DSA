/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraytest;

/**
 *
 * @author User
 */
public class Arraytest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a[] = new int[] {9, 7, 10,1,8};

        int temp=a[3];
        a[3]=a[4];
        a[4]=temp;

        System.out.println("After swaping 4th: " +a[3]);
        System.out.println("After swaping 5th: "+a[4]);
    }
    
}
