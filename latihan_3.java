// Buatlah program Java yang meminta pengguna untuk memasukkan nama, umur, dan tinggi badan mereka. Kemudian, program harus mencetak pesan yang berbunyi: Hai [Nama]! Kamu berumur [Umur] tahun dan tinggi badanmu [Tinggi] cm.

// Liblary Java
import java.util.Scanner;

// Class Main
public class latihan_3 {
  public static void main(String[] args) {
    
    // Create Input Scanner
    Scanner input = new Scanner(System.in);
    
    // Title
    System.out.println("|===| PROGRAM MENGISI DATA |===|");
    
    // Create Variable
    System.out.print("Masukan Nama: ");
    String name = input.nextLine();
    
    System.out.print("Masukan Umur: ");
    int age = input.nextInt();
    
    System.out.print("Masukan Tinggi Badan: ");
    double height = input.nextDouble();
    
    System.out.println("");
    
    // Show Output
    System.out.println("|===| HASIL |===|");
    System.out.println("Hai " + name + "! Kamu berumur " + age + " tahun dan tinggi badanmu " + height + " cm.");
    System.out.println("|==============================|");
    
    // Close Scanner
    input.close();
  }
}