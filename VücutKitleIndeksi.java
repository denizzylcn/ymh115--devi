import java.io.PrintStream;
import java.util.Scanner;

public class VücutKitleIndeksi {
  public static void main(String[]args) {
	  Scanner klavye=new Scanner(System.in);
	  System.out.println("Kilonuzu kg olarak giriniz:");
	  int kilo=klavye.nextInt();
	  System.out.println("Boyunuzu cm olarak giriniz:");
	  int boy =klavye.nextInt();
	  double oran= kilo/boy*boy ;
	  
	  if(oran<2.5)
		  System.out.println("Zayıf");

	  else if(oran>2.5 && oran<3)
		  System.out.println("Normal");
			  
	  else 
		  System.out.println("Kilolu");

		  
		  
	  }
  }
