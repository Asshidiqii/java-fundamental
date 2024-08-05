package juaracoding;

import java.util.Scanner;

public class ArrayJava {
    public static void main(String[] args) {
        // cara 1
        int[] nilai = {86, 87, 89, 90, 91};
        System.out.println(nilai[2]); // Output: 89
        System.out.println(nilai.length); // Output: 5

        // Menggunakan loop for untuk iterasi array nilai
        for (int i = 0; i < nilai.length; i++) {
            System.out.println(nilai[i]);
        }

        // cara 2
        int[] grades = new int[5];
        grades[0] = 86;
        grades[1] = 87;
        grades[2] = 88;
        grades[3] = 89;
        grades[4] = 90;
        grades[2] = 91; // grade[2] diubah dari 88 menjadi 91

        // Menggunakan loop for untuk iterasi array grades
        for (int i = 0; i < grades.length; i++) {
            System.out.println(grades[i]);
        }

        // Menggunakan foreach untuk iterasi array grades
        for (int grade : grades) {
            System.out.printf("%d\n", grade);
        }

        // Menggunakan foreach untuk iterasi array cars
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda" , "Toyota"};
        for (String car : cars) {
            System.out.println(car.toUpperCase());
        }

        // Array Multidimensi, Baris, Kolom
        int[][] number = {{1, 2, 3, 4}, {5, 6, 7}};
        int rowIndex = 0;
        int columnIndex = 3;
        System.out.println(number[1][2]); // Output: 7
        System.out.println(number[rowIndex][columnIndex]); // Output: 4

        // Menggunakan loop for untuk iterasi array multidimensi
        for (int i = 0; i < number.length; i++) { // row length
            for (int j = 0; j < number[i].length; j++) { // column length
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }

        // Mengambil input harga dan menjumlahkannya
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan jumlah data: ");
        int dataLength = scanner.nextInt();
        int[] prices = new int[dataLength];
        int sum = 0;

        for (int i = 0; i < prices.length; i++) {
            System.out.print("Masukkan harga ke-" + (i + 1) + ": ");
            prices[i] = scanner.nextInt();
            sum += prices[i];
        }

        System.out.println("Jumlah total harga: " + sum);

        // Mencari salah satu data mobil menggunakan array
        System.out.println("Cari mobil: ");
        String search = scanner.next();
        boolean found = false;

        for (String car : cars) {
            if (car.equalsIgnoreCase(search)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Mobil ditemukan: " + search);
        } else {
            System.out.println("Mobil tidak ditemukan.");
        }

        // Cari kata terpanjang dari data cars
        String longestCar = "";
        for (String car : cars) {
            if (car.length() > longestCar.length()) {
                longestCar = car;
            }
        }

        System.out.println("Kata terpanjang: " + longestCar);

        scanner.close();
    }
}
