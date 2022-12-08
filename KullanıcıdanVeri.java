import java.util.Scanner;

public class KullanıcıdanVeri {
   public static void main(String[]args) {
	  String isim; 
	  Scanner scan= new Scanner(System.in);
	  
	  System.out.println("Lütfen isminizi giriniz:");
	  isim =scan.nextLine();
	  System.out.println("Merhaba " +  isim);
   }
}
