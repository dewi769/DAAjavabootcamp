package com.bcafinance.praktikum2;
import java.util.Scanner;

public class JavaBasicLogic {
    public static void main(String[] args) {
        double angka = 0;
        int jumlah = 0;
        Scanner sc = new Scanner(System.in);
        try {
            while (true) {
                System.out.print("Masukkan Nilai: ");
                angka += sc.nextDouble();
                jumlah += 1;
            }
        } catch (Exception e) {
            System.out.println("Rata - Rata: "+angka / jumlah);
            sc.close();
        }
    }
}
