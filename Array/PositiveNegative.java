package com.java.Array;

import java.util.Scanner;

public class PositiveNegative{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter array size:");
        int n=sc.nextInt();

        int[] a=new int[n];
        int positive=0,negative=0,zero=0;

        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }

        for(int i=0;i<n;i++){
            if (a[i]>0){
                positive++;
            }
            else if (a[i]<0){
                negative++;
            }
            else{
                zero++;
            }
        }
        System.out.println("Positive count:"+positive);
        System.out.println("Negative count:"+negative);
        System.out.println("Zero count:"+zero);
    }
}
