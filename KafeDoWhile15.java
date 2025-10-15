import java.util.Scanner;

public class KafeDoWhile15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int kopi;
        int teh;
        int roti;
        int totalHarga;
        String namaPelanggan;
        int hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;
        do {
            System.out.println("Masukkan nama pelanggan (ketik `batal` untuk keluar)");
            namaPelanggan = sc.nextLine();
            if (namaPelanggan.equals("batal")) {
                System.out.println("Transaksi dibatalkan.");
                break;

            }
            System.out.print("jumlah kopi");
            kopi = sc.nextInt();
            System.out.print("jumlah teh");
            teh = sc.nextInt();
            System.err.print("jumlah roti");
            roti = sc.nextInt();
            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);

            sc.nextLine();
            System.out.println("Semua transaksi selesai" + totalHarga);

        } while (true);

    }
}
