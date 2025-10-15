import java.util.Scanner;

public class SiakadWhile15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Nilai , jml, i = 0;
        System.out.println("Masukkan jumlah mahasiswa");
        jml = sc.nextInt();
        while (i < jml) {
            System.out.println("Masukkan nilai mahasiswa ke-" + (i + i) + ": ");
            Nilai = sc.nextInt();

            if (Nilai < 0 || Nilai > 100) {
                System.out.println("Nilai tidak valid, masukkan lagi nilai yang valid !");
                continue;
            }

        }
        if (Nilai > 80 && Nilai <= 100) {
            System.out.println("Nilai mahasiswa ke-" + (i + i) + "adalah A");

        } else if (Nilai > 73 && Nilai <= 100) {
            System.out.println("Nilai mahasiswa ke-" + (i + i) + "adalah B+");

        } else if (Nilai > 65 && Nilai <= 73) {
            System.out.println("Nilai Mahasiswa ke-" + (i + i) + "adalah B");

        } else if (Nilai > 60 && Nilai <= 65) {
            System.out.println("Nilai Mahasiswa ke-" + (i + i) + "adalah E");

        }
        i++;
    }

}
