package juaracoding;

import java.util.Scanner;

public class Perulangan {
    public static void main(String[] args) {
        // Perulangan for dengan kondisi yang benar
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("Next Statement");

        // Perulangan for untuk menampilkan angka ganjil dari 0 sampai 19
        for (int i = 0; i < 20; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }

        // Nested for loop untuk membuat pola segitiga
        int sisi = 10;
        for (int i = 0; i < sisi; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Nested for loop untuk membuat pola segitiga terbalik
        for (int i = sisi; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Loop while
        int x = 0;
        while (x < 5) {
            System.out.println(x);
            x++;
        }

        // Loop do-while
        int y = 5;
        do {
            System.out.println(y);
            y++;
        } while (y < 5);

        // Looping tanpa henti
        Scanner input = new Scanner(System.in); // Perbaikan pada Scanner
        while (true) {
            System.out.println("Running");
            int number = input.nextInt();
            if(number == 0) break;
            // Tambahkan logika berhenti jika diperlukan
        }
    }
}
