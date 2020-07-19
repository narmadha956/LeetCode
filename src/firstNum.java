/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

import java.util.Scanner;

//import for Scanner and other utility classes

class TestClass {
    public static void main(String args[]) throws Exception {


        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();


        for (int i = 1; i <= testCases; i++) {
            int number = sc.nextInt();
            int inc = sc.nextInt();
            int dec = sc.nextInt();
            //odd an prime is  3,5,7
            int incrementBy = increment(number) - number;
            int decrementBy = (decrement(number) != 0) ? number - decrement(number) : 0;

            if (decrementBy != 0) {
                if (incrementBy > decrementBy)
                    System.out.println(decrementBy * dec);
                else if (incrementBy == decrementBy) {
                    if (incrementBy * inc > decrementBy * dec)
                        System.out.println(decrementBy * dec);
                    else
                        System.out.println(incrementBy * inc);
                } else
                    System.out.println(incrementBy * inc);
            } else
                System.out.println(incrementBy * inc);
        }


    }

    public static int increment(int num) {
        int flag = 0;
        int[] a = {8, 12, 10};
        do {
            for (int j = 0; j < a.length; j++) {
                if (num % a[j] == 0)
                    flag = 1;
            }
            num++;

        } while (flag != 1);
        return num - 1;
    }

    public static int decrement(int num) {
        int flag = 0;
        int[] a = {8, 12, 10};
        do {
            for (int j = 0; j < a.length; j++) {
                if (num % a[j] == 0)
                    flag = 1;
            }
            num--;

        } while (flag != 1 || num == 0);

        if (num != 0)
            return num + 1;
        else
            return 0;
    }
}