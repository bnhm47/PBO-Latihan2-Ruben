import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();
        
        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();
        
        System.out.print("Masukkan usia: ");
        int usia = input.nextInt();
        
        System.out.print("Masukkan tinggi badan (cm): ");
        double tinggiBadan = input.nextDouble();
        
        System.out.println("\nInformasi yang dimasukkan:");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Usia: " + usia + " tahun");
        System.out.println("Tinggi Badan: " + tinggiBadan + " cm");
        
        double hasilOperasi = (usia * 2) + 10 / 5 - 3;
        System.out.println("\nHasil dari (usia * 2) + 10 / 5 - 3 adalah: " + hasilOperasi);
        
        boolean usiaLebihDari18 = usia > 18;
        System.out.println("Apakah usia lebih besar dari 18? " + usiaLebihDari18);
        
        boolean kondisi = usia > 18 && tinggiBadan > 160;
        System.out.println("Apakah usia lebih besar dari 18 dan tinggi badan lebih dari 160 cm? " + kondisi);
        
        double usiaDouble = (double) usia;
        int tinggiBadanInt = (int) tinggiBadan;
        
        System.out.println("\nHasil konversi tipe data:");
        System.out.println("Usia (int ke double): " + usiaDouble);
        System.out.println("Tinggi Badan (double ke int): " + tinggiBadanInt);
        
        input.close();
    }
}
