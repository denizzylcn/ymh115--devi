import java.util.Scanner;

public class UcgenCızdırme {
	public static void main(String[] args) {
        Scanner yeniGirdi=new Scanner(System.in);
        System.out.print("Yüksekliği giriniz:");
        int yukseklik=yeniGirdi.nextInt();
        String yazdir="";
        for (int i = 1; i <= yukseklik;i++) {
            String bosluk="";
            String yildiz="";
            for (int j = 1; j <=yukseklik-i; j++) {
                bosluk+=" ";
            }
            for (int j = 1; j <=2*i-1; j++) {
                yildiz+="*";
            }
          yazdir=bosluk+yildiz; 
          System.out.println(yazdir);
        }
    }
    
}



	