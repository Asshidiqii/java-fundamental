package juaracoding;

public class MethodJava {
    public static void main(String[] args) {
        // Menggambar kotak
        kotak(5);
        kotak(8);

        // Menghitung dan menampilkan luas kotak
        System.out.println(luasKotak(5));
        System.out.println(luasKotak(8));

        // Menghitung dan menampilkan volume kotak
        volumeKotak(20);

        // Mengatur dan menampilkan nama
        System.out.println(setName("Indonesia", "Jakarta"));

        // Contoh penggunaan metode login
        System.out.println(login("admin", "password123"));

        // Menampilkan detail produk
        detailProduct("Elektronik", "Laptop", "Laptop dengan spesifikasi tinggi", 15000000);

        // Menghitung dan menampilkan total gaji per tahun
        double salary = 7000;
        System.out.println("Pph per bulan = " +calculateTax(salary));
        totalSalaryPerYear(8000);

    }

    // Metode untuk menggambar kotak dari '*' dengan panjang sisi 'sisi'
    static void kotak(int sisi) {
        for (int i = 0; i < sisi; i++) {
            for (int j = 0; j < sisi; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println(); // Menambahkan baris kosong antara kotak
    }

    // Metode untuk menghitung luas kotak
    static double luasKotak(int sisi) {
        return sisi * sisi;
    }

    // Metode untuk menghitung volume kotak
    static void volumeKotak(int sisi) {
        System.out.println(luasKotak(sisi) * sisi);
    }

    // Metode untuk mengatur dan mengembalikan nama
    static String setName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    // Metode untuk login yang mengembalikan nilai boolean
    static boolean login(String username, String password) {
        // Contoh logika sederhana untuk login
        if (username.equals("admin") && password.equals("password123")) {
            return true;
        } else {
            return false;
        }
    }

    // Metode untuk menampilkan detail produk
    static void detailProduct(String category, String productName, String description, int price) {
        System.out.println("Kategori: " + category);
        System.out.println("Nama Produk: " + productName);
        System.out.println("Deskripsi: " + description);
        System.out.println("Harga: Rp " + price);
    }

    // Metode untuk menghitung pajak
    static double calculateTax(double salary) {
        if (salary >= 7000) {
            return salary * 0.1;
        } else {
            return 0;
        }
    }

    // Metode untuk menghitung total gaji per tahun setelah pajak
    static void totalSalaryPerYear(double salary) {
        double total = (salary - calculateTax(salary)) * 12;
        System.out.println("Total Gaji Bersih Pertahun: Rp " + total);
    }
}
