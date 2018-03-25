import java.util.Scanner;
public class Multiplicarray {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in); 
		int x=0,h=-1,re=0,absor=0;
		
		
		
		int numerico[] = new int[1000];
	
		for (int i=0; i > h; i++) {
		System.out.println("preencha a matriz como quiser, 0 para sair");
		x=ler.nextInt();
		if (x == 0) {break;}
		numerico[i]=x;
		absor=i;
		}//fim for
				
		
		System.out.println("digite o numero que vc quer multiplicar o vetor");
		re=ler.nextInt();
		
		for (int j=0; j < absor+1;j++ ) {
			numerico[j]=(numerico[j]*re);
			
		}
		
		for (int j=0; j < absor+1;j++ ) {
			System.out.println(numerico[j]);
		}
		

	}//fim main

}

