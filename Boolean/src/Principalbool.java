import java.util.Scanner;
public class Principalbool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		
		
		System.out.println("digite um valor");
		
		Scanner ler1 = new Scanner(System.in);
		n = ler1.nextInt();
		
	  
		A ler = new A();
	    ler.m(n);
	    
	    if (ler.m(n)) {System.out.println("eh maior que zero e o valor é "+n*10);}
	    else {System.out.println("eh menor ou igual a zero");}
	}

}
