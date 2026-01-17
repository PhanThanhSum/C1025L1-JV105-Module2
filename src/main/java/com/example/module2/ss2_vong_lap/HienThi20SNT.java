package com.example.module2.ss2_vong_lap;

public class HienThi20SNT {
    public static boolean ktSoNT(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int dem = 0;
        int i = 2;
        while (dem < 20) {
            if (ktSoNT(i)) {
                dem++;
                System.out.println(i);
            }
            i++;
        }

    }
}
