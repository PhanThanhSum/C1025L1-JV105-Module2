package com.example.module2.ss2_vong_lap;

public class HienThiSNT100 {
    public static void sang(int[] arr){
        arr[0] = arr[1] = 1;
        for (int i = 2; i < Math.sqrt(100); i++){
            if (arr[i] == 0) {
                for (int j = i * i; j < 100; j += i){
                    arr[j] = 1;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[100];
        sang(arr);
        for (int i = 0; i < 100; i++) {
            if (arr[i] == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
