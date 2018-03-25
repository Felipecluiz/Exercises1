import java.util.Scanner;


public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// adulto criança ou adolescente
		
int pessoa,ter=0,parar2=0,stop=0;
String nome;
boolean parar = true;

		
		
		do  {
			
			System.out.println("qual seu nome?");
			Scanner ler2 = new Scanner(System.in);
			nome = ler2.nextLine();	
			
		System.out.println("qual sua idade?");
		Scanner ler = new Scanner(System.in);
		pessoa = ler.nextInt();	
		
		
		
		if (pessoa < 12){
			System.out.println ("tu eh uma criança maldita"+" e o seu nome é "+nome);
			}
		
		else if (pessoa >= 18){
			System.out.println ("tu eh um adulto"+" e o seu nome é "+nome);
			}
		
		else {
			System.out.println ("tu eh adolescente"+" e o seu nome é "+nome);
			}
		stop++;
		} while (stop != 5);
		
		
		
	}

}
