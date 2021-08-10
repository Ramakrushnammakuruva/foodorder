package com.eample.foodorder;

import java.util.Scanner;
//1. Give any integer, print an English phrase that describes the integer.
//            ( e.g. input: 1234, output:  “One Thousand Two Hundred Thirty Four”)

class IntegerToEnglishPhrase {

    public static void main(String[] args) {
        //infinite reading
        while (true){
            String inr = scanValue();
            getNumberToWords(inr.toCharArray());
        }

    }
    public static String scanValue(){
        Scanner sc = new Scanner(System.in); //Read value from console
        System.out.print("Enter a Number: ");
        return sc.nextLine(); //reads string.
    }

    static void getNumberToWords(char[] num) {
        int len = num.length;

        if (len == 0) {
            System.out.println("Value not be empty");
            return;
        }

        // First digit words
        String[] digits_1 = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        // Second digit words
        String[] digits_2 = new String[]{"", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

        // Multiple with 10 digit words
        String[] digits_10Multiple = new String[]{"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        String[] tens_power = new String[]{"hundred", "thousand"};

        System.out.print(String.valueOf(num) + ": ");

        // First digit
        if (len == 1) {
            System.out.println(digits_1[num[0] - '0']);
            return;
        }

        int x = 0;
        while (x < num.length) {
            // Second digits
            if (len >= 3) {
                if (num[x] - '0' != 0) {
                    System.out.print(digits_1[num[x] - '0'] + " ");
                    System.out.print(tens_power[len - 3] + " ");
                }
                --len;
            }

            // Last 2 digits
            else {
                if (num[x] - '0' == 1) {
                    int sum = num[x] - '0' + num[x + 1] - '0';
                    System.out.println(digits_2[sum]);
                    return;
                }
                else if (num[x] - '0' == 2 && num[x + 1] - '0' == 0) {
                    System.out.println("twenty");
                    return;
                }
                else {
                    int i = (num[x] - '0');
                    if (i > 0) System.out.print(digits_10Multiple[i] + " ");
                    else System.out.print("");
                    ++x;
                    if (num[x] - '0' != 0) System.out.println(digits_1[num[x] - '0']);
                }
            }
            ++x;
        }
    }
}