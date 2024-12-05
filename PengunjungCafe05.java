import java.util.Scanner;

public class PengunjungCafe05 {
    
    void daftarPengunjung(String kodePromo, int... jumlahPengunjung) {
        System.out.println("Kode Promo: " + kodePromo);
        System.out.println("Jumlah Pengunjung: ");
        for (int jumlah : jumlahPengunjung) {
            System.out.println(jumlah);
        }
    }
    
    public static void main(String[] args) {
        daftarPengunjung("Ali", "Budi", "Citra");
    }
}