/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package selectionsorttestdecending;

import java.util.Arrays;
public class SelectionSortTestDecending{
    Integer[] a;
    public SelectionSortTestDecending(Integer[] a){
        this.a = a;

    }
    public void swap(int i,int j)
        {
            int temp= a[i];
            a[i]=a[j];
            a[j]=temp;
        }
    public void selectionSort()
    {
        int n = a.length;
        for(int i = 0; i<n-1; i++)
        {
            int max_idx = i;//meya hithagannawa ,eya thamai kotama kiyala 
            for(int  j=i+1; j<n; j++)
            {
                if(a[j] > a[max_idx])
                {
                    max_idx = j;
                }

                System.out.println(
                    "i = " 
                    + (i)
                    + "; j = "
                    + (j)
                    +"; max ="
                    +a[max_idx]
                    +"; "
                    +Arrays.deepToString(a)

                );
            }
            swap(i,max_idx);

        }

    }
    public static void main(String[] args)
    {
       Integer[] a ={76,6, 107,92,21,23,5,9,8,8143};
       System.out.println("Array before sorting =" +Arrays.deepToString(a));
       SelectionSortTestDecending sorter = new SelectionSortTestDecending(a);
       sorter.selectionSort();
       System.out.println("Array After sorting =" +Arrays.deepToString(sorter.a));
    }
}