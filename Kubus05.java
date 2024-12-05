import java.util.Scanner;

public class Kubus05 {

    static int[][] penjualan = new int[5][7];
    static String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};

    public static void inputPenjualan() {
        Scanner sc05 = new Scanner(System.in);

        for (int i = 0; i < menu.length; i++) {
            System.out.println("Masukkan penjualan untuk menu: " + menu[i]);
            for (int j = 0; j < 7; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = sc05.nextInt();
            }
            System.out.println();
        }
    }

    public static void tampilkanPenjualan() {
        System.out.println("Rekap Penjualan selama 7 hari:");
        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i] + ": ");
            for (int j = 0; j < 7; j++) {
                System.out.print(penjualan[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void menuPenjualanTertinggi() {
        int maxPenjualan = 0;
        String menuTertinggi = "";

        for (int i = 0; i < menu.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < 7; j++) {
                totalPenjualan += penjualan[i][j];
            }
            if (totalPenjualan > maxPenjualan) {
                maxPenjualan = totalPenjualan;
                menuTertinggi = menu[i];
            }
        }

        System.out.println("Menu dengan penjualan tertinggi adalah: " + menuTertinggi + " dengan total penjualan " + maxPenjualan);
    }

    public static void rataRataPenjualan() {
        for (int i = 0; i < menu.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < 7; j++) {
                totalPenjualan += penjualan[i][j];
            }
            double rataRata = totalPenjualan / 7.0;
            System.out.println("Rata-rata penjualan untuk " + menu[i] + ": " + rataRata);
        }
    }

    public static void main(String[] args) {
        Scanner sc05 = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahMahasiswa = sc05.nextInt();

        System.out.print("Masukkan jumlah tugas: ");
        int jumlahTugas = sc05.nextInt();

        int[][] nilaiTugas = new int[jumlahMahasiswa][jumlahTugas];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.println("Masukkan nilai tugas untuk Mahasiswa " + (i + 1) + ":");
            for (int j = 0; j < jumlahTugas; j++) {
                System.out.print("Tugas ke-" + (j + 1) + ": ");
                nilaiTugas[i][j] = sc05.nextInt();
            }
        }

        System.out.println("\nNilai Tugas Mahasiswa:");
        for (int i = 0; i < jumlahMahasiswa; i++) {
            System.out.print("Mahasiswa " + (i + 1) + ": ");
            for (int j = 0; j < jumlahTugas; j++) {
                System.out.print(nilaiTugas[i][j] + " ");
            }
            System.out.println();
        }

        // Menginputkan data penjualan
        inputPenjualan();

        // Menampilkan data penjualan
        tampilkanPenjualan();

        // Menampilkan menu dengan penjualan tertinggi
        menuPenjualanTertinggi();

        // Menampilkan rata-rata penjualan untuk setiap menu
        rataRataPenjualan();

        sc05.close();
    }
}