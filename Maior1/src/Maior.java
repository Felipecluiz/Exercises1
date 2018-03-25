
	  import java.util.Scanner;

public class Maior {
	  public static void main(String[] args) {}
	 int retMaior(int n1, int n2, int n3) {
     int maior=0;
	 
     System.out.println("receber primeiro valor");
     Scanner ler = new Scanner(System.in);
     n1 = ler.nextInt();
     
     System.out.println("receber segundo valor");
     Scanner ler1 = new Scanner(System.in);
     n2 = ler1.nextInt();
     
     System.out.println("receber terceiro valor");
     Scanner ler2 = new Scanner(System.in);
     n3 = ler2.nextInt();
     
     
     if (n1>n2) {maior=n1;}
     else if (n2>n3) {maior=n2;}
     else if (n3>n1) {maior=n3;}
     else {System.out.println("algum dos valores sao iguais");}
     return maior;
	
}
}
