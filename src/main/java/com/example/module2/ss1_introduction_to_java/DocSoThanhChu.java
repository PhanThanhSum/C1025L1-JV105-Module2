package com.example.module2.ss1_introduction_to_java;

import java.util.Scanner;

public class DocSoThanhChu {
//    public static String chuSoThanhChu(int num, int type){
//        switch (num){
//            case 1:
//                if (type == 1) {
//                    return "một";
//                } else {
//                    return "mốt";
//                }
//            case 2:
//                return "hai";
//            case 3:
//                return "ba";
//            case 4:
//                return "bốn";
//            case 5:
//                if(type == 1 ){
//                    return "năm";
//                } else {
//                    return "lăm";
//                }
//            case 6:
//                return "sáu";
//            case 7:
//                return "bảy";
//            case 8:
//                return "tám";
//            case 9:
//                return "chín";
//            case 0:
//                if (type == 1) {
//                    return "không";
//                } else if (type == 2){
//                    return "lẻ";
//                } else {
//                    return "";
//                }
//        }
//        return "";
//    }
//
//    public static String docSo1(int num) {
//        return chuSoThanhChu(num, 1);
//    }
//
//    public static String docSo2(int num){
//        String str = "";
//        if (num >= 10 && num <= 19) {
//            str = "mười" + chuSoThanhChu(num, 1);
//        } else {
//            int hangDonVi = num % 10;
//            int hangChuc = num / 10;
//            str = chuSoThanhChu(hangChuc, 1)
//
//        }
//
//        return str;
//    }

    private static final String[] NUMBERS = {
            "không", "một", "hai", "ba", "bốn",
            "năm", "sáu", "bảy", "tám", "chín"
    };

    public static String convert(long money) {
        if (money == 0) {
            return "Không đồng";
        }

        if (money >= 1_000_000_000) {
            throw new IllegalArgumentException("Số tiền phải nhỏ hơn 1 tỷ");
        }

        String result = readNumber(money).trim();
        result = result.substring(0, 1).toUpperCase() + result.substring(1);
        return result + " đồng";
    }

    private static String readNumber(long number) {
        StringBuilder result = new StringBuilder();

        long million = number / 1_000_000;
        long thousand = (number % 1_000_000) / 1_000;
        long unit = number % 1_000;

        if (million > 0) {
            result.append(readThreeDigits(million)).append(" triệu ");
        }

        if (thousand > 0) {
            result.append(readThreeDigits(thousand)).append(" nghìn ");
        }

        if (unit > 0) {
            result.append(readThreeDigits(unit));
        }

        return result.toString();
    }

    private static String readThreeDigits(long number) {
        StringBuilder result = new StringBuilder();

        int hundred = (int) (number / 100);
        int ten = (int) ((number % 100) / 10);
        int unit = (int) (number % 10);

        if (hundred > 0) {
            result.append(NUMBERS[hundred]).append(" trăm");
            if (ten == 0 && unit > 0) {
                result.append(" lẻ");
            }
            result.append(" ");
        }

        if (ten > 1) {
            result.append(NUMBERS[ten]).append(" mươi ");
            if (unit == 1) {
                result.append("mốt ");
            } else if (unit == 5) {
                result.append("lăm ");
            } else if (unit > 0) {
                result.append(NUMBERS[unit]).append(" ");
            }
        } else if (ten == 1) {
            result.append("mười ");
            if (unit == 5) {
                result.append("lăm ");
            } else if (unit > 0) {
                result.append(NUMBERS[unit]).append(" ");
            }
        } else if (ten == 0 && unit > 0 && hundred == 0) {
            result.append(NUMBERS[unit]).append(" ");
        }

        return result.toString();
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hay nhap so can doc: ");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            System.out.println(convert(num));
        }

    }
}
