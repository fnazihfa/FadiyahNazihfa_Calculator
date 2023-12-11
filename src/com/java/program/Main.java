package com.java.program;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int nilaiA,nilaiB;
        String operator;
        char ulang;
        do {
            Scanner inputUser = new Scanner(System.in);
            System.out.print("Input nilai A: ");
            nilaiA = inputUser.nextInt();
            System.out.print("Input nilai B: ");
            nilaiB = inputUser.nextInt();
            System.out.print("Input operator hitung: ");
            operator = inputUser.next();

            Hitung hitung = new Hitung();
            hitung.a = nilaiA;
            hitung.b = nilaiB;

            switch (operator) {
                case "+":
                    System.out.printf("%d + %d = %d\n",nilaiA,nilaiB,hitung.tambah());
                    break;
                case "-":
                    System.out.printf("%d - %d = %d\n",nilaiA,nilaiB,hitung.kurang());
                    break;
                case "*":
                    System.out.printf("%d * %d = %d\n",nilaiA,nilaiB,hitung.kali());
                    break;
                case "/":
                    System.out.printf("%d / %d = %.1f\n",nilaiA,nilaiB,hitung.bagi());
                    break;
                case "%":
                    System.out.printf("%d mod %d = %d\n",nilaiA,nilaiB,hitung.modulus());
                    break;
                default:
                    System.out.println("Operator yang diinput tidak sesuai.\nSilakan input operator kembali!\n");
            }
            System.out.print("Ingin menghitung ulang (y/n)?: ");
            ulang = inputUser.next().charAt(0);
        } while (ulang!='n');
        System.out.println("");
        System.out.println("Terima kasih \nFadiyah Nazihfa Ukhti");
    }
}
