package com.java.Array;

import java.util.Scanner;

public class EvenOdd{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter array size:");
        int n=sc.nextInt();

        int[] a=new int[n];
        int even=0,odd=0;

        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(a[i]%2==0){
                even++;
            } 
            else{
                odd++;
            }
        }
        System.out.println("Even nos count:"+even);
        System.out.println("Odd nos count:"+odd);
    }
}
