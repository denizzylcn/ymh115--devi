


import java.util.Scanner;

//Vize notunun %40'ını ,Final notunun %60'ını alarak ortalama hesaplayınız 
//Ortalama 40 dan büyük ise "Geçti" , küçükse "Kaldı" yazdıran programlama 
public class ort{
	public static void main(String []args) {
    int vize,fnl;
    float ortalama;
    
    Scanner scan = new Scanner(System.in);
    System.out.println("Vize:");
    vize = scan.nextInt();
    
    System.out.println("Final:");
    fnl = scan.nextInt();
    
    ortalama = (float)(vize*0.4 + fnl*0.6);
    
    System.out.println("Ortalamanız = " + ortalama);
    if(ortalama>=40)System.out.println("Geçti");
    else System.out.println("Kaldı");
	}
}

