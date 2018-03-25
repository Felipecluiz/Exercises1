import java.util.Scanner;
public class Array2 {


	public static void main(String[] args) {
	
		int x=10,receiv,receiv2=0,g=0;
		double total=0;
		boolean stop = true;
		String exit= "sim";
		String exit1= "s";
		String sair=null;
		Scanner ler = new Scanner(System.in);
		
		int matriz[] = new int[10];
		
		for (int i=0; i < 10; i++){
		g++;
		System.out.println("preencha os valores para saber a media movel");
		receiv = ler.nextInt();
		matriz[i]=receiv;
		total=matriz[i]+total;
		
		
		System.out.println("media atual "+(total/g));
		
		}// fim do for
		total=0;
		
		
		while (stop){
			System.out.println("digite o valor mais atual para calcular a media movel");
			receiv2= ler.nextInt();
			
			for (int u=0; u < matriz.length-1;u++){
				
				matriz[u]=matriz[u+1];
				
				total=matriz[u]+total;
				
			}
			
			
			matriz[9]=receiv2;
			
			total= total + matriz[9];
			System.out.println(total);
			
			System.out.println("media movel "+(total/10));
			
			
			System.out.println("deseja sair? sim ou nao?");
			Scanner ler1 = new Scanner(System.in);
			sair = ler1.nextLine();
			
			
			
		    sair.toLowerCase();
			if (exit.equals(sair) || exit1.equals(sair)){stop=false;}
			else {continue;}
			
		}
		
		
		
		
		


	}

}
