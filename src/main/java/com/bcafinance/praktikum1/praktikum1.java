package com.bcafinance.praktikum1;

import java.util.Scanner;

public class praktikum1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Kata: ");
        String input = scanner.nextLine();

        int hasil = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            int val = ch;
            if(val < 97) {

                hasil += val;
            }
        }
        System.out.println("Input dari : "  + hasil);
    }
}
