package com.example.module2.ss1_introduction_to_java;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        double vnd = 23000;
        Scanner sc = new Scanner(System.in);
        double usd = Double.parseDouble(sc.nextLine());
        System.out.println("VND quy doi: " + (usd * vnd));
    }
}
