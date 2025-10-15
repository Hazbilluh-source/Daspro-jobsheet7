import java.util.Scanner;
public class Penjualantiket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int hargaTiket = 50000;
        int totalTiketTerjual = 0;
        int totalPenjualan = 0;

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli (0 untuk selesai): ");
            int jumlahTiket = scanner.nextInt();

    
            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak boleh negatif. Silakan masukkan ulang.");
                continue;
            }

            if (jumlahTiket == 0) {
                break;
            }

            int hargaTotal = hargaTiket * jumlahTiket;

           
            if (jumlahTiket > 10) {
                hargaTotal *= 0.85; 
            } else if (jumlahTiket > 4) {
                hargaTotal *= 0.90;
            }

           
            totalTiketTerjual += jumlahTiket;
            totalPenjualan += hargaTotal;

            System.out.println("Total bayar untuk transaksi ini: Rp " + hargaTotal);
            System.out.println();
        }

    
        System.out.println("=== Ringkasan Penjualan Hari Ini ===");
        System.out.println("Total tiket terjual: " + totalTiketTerjual);
        System.out.println("Total penjualan: Rp " + totalPenjualan);

        scanner.close();
    }
}
