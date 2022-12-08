
public class FıbonacciSayı {
   public static void main(String[]args) {
	   int a=0;
	   int b=1;
	   int c=1;
	   
	   do {
		 c= a+b;
		 System.out.println(c + " - ");
		 a=b;
	     b=c;
	   }while(c<1000);
   }
}
