import java.util.Scanner;

public class Kafe05 {

    public static void main(String[] args) {
        Menu("Andi", true, "DISKON50"); 
        
        Scanner sc05 = new Scanner(System.in);

        System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
        int pilihanMenu = sc05.nextInt();
        System.out.print("Masukkan jumlah item yang ingin dipesan: ");
        int banyakItem = sc05.nextInt();
        int totalHargaKeseluruhan = 0;
        System.out.print("Masukkan kode promo: ");
        String kodePromo = sc05.next();

        int hargaTotal = hitungTotalHarga06(pilihanMenu, banyakItem, kodePromo);
        System.out.println("Total harga untuk pesanan Anda: Rp " + hargaTotal);
        totalHargaKeseluruhan += hargaTotal;
        
        System.out.println("Harga untuk pesanan ini: Rp " + hargaTotal);
    }

    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");
        
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        
        if (kodePromo.equals("DISKON50")) {
            System.out.println("Selamat! Anda mendapatkan diskon 50% dengan kode promo: DISKON50");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Anda mendapatkan diskon 30% dengan kode promo: DISKON30");
        } else {
            System.out.println("Kode promo tidak valid.");
        }

    }
        
    public static void menu() {
        
        System.out.println("===== Menu Resto Kafe =====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie goreng - Rp 18,000");
        System.out.println("=========================");
        System.out.println("Silahkan pilih menu yang anda inginkan");
    }

    public static int hitungTotalHarga06(int pilihanMenu, int banyakItem, String kodePromo) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        
        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;

        if (kodePromo.equals("DISKON50")) {
            hargaTotal = (int)(hargaTotal * 0.5); 
        } else if (kodePromo.equals("DISKON30")) {
            hargaTotal = (int)(hargaTotal * 0.7); 
        } else {
            System.out.println("Kode promo tidak valid, tidak ada diskon.");
        }

        return hargaTotal;
    }
}