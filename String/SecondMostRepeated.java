package com.java.String;

public class SecondMostRepeated {
    public static void main(String[] args) {
        String str = "aabbcccdddd";
        
        int max1 = 0;
        int max2 = 0;

        char first = ' ';
        char second = ' ';

        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            if (count > max1) {
                max2 = max1;
                second = first;
                
                max1 = count;
                first = str.charAt(i);

            } else if (count > max2 && count < max1) {
                max2 = count;
                second = str.charAt(i);
            }
        }
        System.out.println(second + " (frequency: " + max2 + ")");
    }
}
