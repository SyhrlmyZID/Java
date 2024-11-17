// Liblary Java
import java.util.Scanner;

// Class Main
public class scanner_3 {
  public static void main(String[] args) {
    
    // Create Input Scanner
    Scanner input_1 = new Scanner(System.in);
    Scanner input_2 = new Scanner(System.in);
    
    // Create Variable
    System.out.print("Masukan Angka Pertama: ");
    int value_1 = input_1.nextInt();
    
    System.out.print("Masukan Angka Kedua: ");
    int value_2 = input_2.nextInt();
    
    // Check Result Addition 
    int result_addition = value_1 + value_2;
    
    System.out.println("Hasil Nya Adalah: " + result_addition);
    
  }
}