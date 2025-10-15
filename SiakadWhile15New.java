import java.util.Scanner;
public class SiakadWhile15New {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlahNilai;
        int jml; 
        int i = 0;
        System.out.println("Masukkan jumlah mahasiswa");
        jml = sc.nextInt();
        while (i < jml) {
            System.out.println("Masukkan nilai mahasiswa ke-" + (i + i) + ": ");
            jumlahNilai = sc.nextInt();

            if (jumlahNilai < 0 || jumlahNilai > 100) {
                System.out.println("Nilai tidak valid, masukkan lagi nilai yang valid !");
                continue;
            }

        }
        if (jumlahNilai > 80 && jumlahNilai <= 100) {
            System.out.println("Nilai mahasiswa ke-" + (i + i) + "adalah A");

        } else if (jumlahNilai > 73 && jumlahNilai <= 100) {
            System.out.println("Nilai mahasiswa ke-" + (i + i) + "adalah B+");

        } else if (jumlahNilai > 65 && jumlahNilai <= 73) {
            System.out.println("Nilai Mahasiswa ke-" + (i + i) + "adalah B");

        } else if (jumlahNilai > 60 && jumlahNilai <= 65) {
            System.out.println("Nilai Mahasiswa ke-" + (i + i) + "adalah E");

        }
        i++;
        sc.close();
    }

}

