import java.util.Scanner;

public class UcSayıdanBuyugu {
	public static void main(String[]args) {
		int a,b,c ;
		Scanner scan= new Scanner(System.in);
		
		System.out.println("1.sayı");
		a=scan.nextInt();
		System.out.println("2.sayı");
		b=scan.nextInt();
		System.out.println("3.sayı");
		c=scan.nextInt();
		if(a>b && a>c)System.out.println("En büyük sayı= " + a);
		else if(b>a && b>c)System.out.println("En büyük sayı= " + b);
		else if(c>a && c>b)System.out.println("En büyük sayı= " + c);
	}

}
