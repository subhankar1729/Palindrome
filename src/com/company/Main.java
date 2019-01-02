package com.company;

public class Main {

    public static void main(String[] args) {
        int number = 8128;
        System.out.println("The PALINDROME numbers are: ");
        for (int i = 0; i <= number; i++) {
            boolean flag = palindrome(i);
            if (flag) {
                System.out.println(i + " is palindrome number");
            }/*else
                System.out.println(i+" is not perfect number");*/

        }
    }

    private static boolean palindrome(int number) {
        boolean flag;
        int temp = number, str = 0;
        if (number > -1) {
            while (temp != 0) {
                str = str * 10 + temp % 10;
                temp /= 10;
            }
            if (number == str) {
                flag = true;
            } else {
                flag = false;
            }
        } else {
            flag = false;
        }
        return flag;
    }
}