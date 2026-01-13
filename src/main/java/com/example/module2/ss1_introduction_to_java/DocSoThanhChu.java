package com.example.module2.ss1_introduction_to_java;

import java.util.Scanner;

public class DocSoThanhChu {
    private static final String[] ONES = {
            "zero", "one", "two", "three", "four",
            "five", "six", "seven", "eight", "nine",
            "ten", "eleven", "twelve", "thirteen", "fourteen",
            "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };

    private static final String[] TENS = {
            "", "", "twenty", "thirty", "forty",
            "fifty", "sixty", "seventy", "eighty", "ninety"
    };

    public static String convert(int number) {
        if (number < 0 || number > 999) {
            return "Number out of range";
        }

        if (number < 20) {
            return ONES[number];
        }

        if (number < 100) {
            int ten = number / 10;
            int unit = number % 10;

            if (unit == 0) {
                return TENS[ten];
            }
            return TENS[ten] + " " + ONES[unit];
        }

        int hundred = number / 100;
        int rest = number % 100;

        if (rest == 0) {
            return ONES[hundred] + " hundred";
        }

        return ONES[hundred] + " hundred and " + convert(rest);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (0 - 999): ");
        int number = scanner.nextInt();

        System.out.println(convert(number));

        scanner.close();
    }

}
