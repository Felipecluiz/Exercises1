import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     int maior=0;
	     int n1,n2,n3;
		 
        int pv = 0,sv = 0,tv=0,re=0; 
		
	
		
		 System.out.println("receber primeiro valor");
	     Scanner ler3 = new Scanner(System.in);
	     n1 = ler3.nextInt();
	     
	     System.out.println("receber segundo valor");
	     Scanner ler1 = new Scanner(System.in);
	     n2 = ler1.nextInt();
	     
	     System.out.println("receber terceiro valor");
	     Scanner ler2 = new Scanner(System.in);
	     n3 = ler2.nextInt();
	     Maior ler = new Maior();
	 	ler.retMaior(n1,n2,n3,re);
	     
	     if (re == 0) {System.out.println("algum dos valores sao iguais");}
	     else {System.out.println(re);}
	     System.out.println(re);
	     System.out.println(n3);
	     System.out.println(n2);
	     System.out.println(n1);
		          
	}

}
