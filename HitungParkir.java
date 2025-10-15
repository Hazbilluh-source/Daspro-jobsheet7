import java.util.Scanner;
public class HitungParkir {
  


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int jenis = -1; 
        int durasi = 0;
        long total = 0; 
       
        while (jenis != 0) {
            
           
            System.out.println("\nMasukkan jenis kendaraan:");
            System.out.println("(1 Mobil, 2 Motor, 0 Keluar)");
           
            if (scanner.hasNextInt()) {
                jenis = scanner.nextInt();
            } else {
                System.out.println("Input tidak valid. Silakan masukkan angka.");
                scanner.next(); 
                continue; 
            }

           
            if (jenis == 1 || jenis == 2) {
                
               
                System.out.print("Masukkan durasi parkir (dalam jam): ");
                if (scanner.hasNextInt()) {
                    durasi = scanner.nextInt();
                } else {
                    System.out.println("Input durasi tidak valid. Silakan masukkan angka.");
                    scanner.next();
                    continue; 
                }

                
                if (durasi > 5) {
                   
                    total += 12500;
                    System.out.println("Durasi parkir lebih dari 5 jam. Tarif tetap Rp 12.500.");
                } else {
                   
                    if (jenis == 1) {
                       
                        long biayaParkir = (long) durasi * 3000;
                        total += biayaParkir;
                        System.out.println("Jenis: Mobil. Biaya Parkir: Rp " + biayaParkir);
                    } 
                    
                    else { 
                       
                        long biayaParkir = (long) durasi * 2000;
                        total += biayaParkir;
                        System.out.println("Jenis: Motor. Biaya Parkir: Rp " + biayaParkir);
                    }
                }
                
            } 
           
            else if (jenis == 0) {
                
                System.out.println("Memilih Keluar. Menghitung total pembayaran.");
            } else {
                
                System.out.println("Pilihan jenis kendaraan tidak valid. Silakan coba lagi.");
            }
        } 
        
       
        System.out.println("\n========================================");
        System.out.println("Total pembayaran parkir keseluruhan: Rp " + total);
        System.out.println("Terima kasih.");
        System.out.println("========================================");

        
        scanner.close();
        
    } 
}
    
