import java.util.Scanner;
public class Parouimpar {

	public static void main(String[] args) {
		// determinar se é par ou impar
		
		int numero;
		System.out.println("digite um numero");
		Scanner ler = new Scanner(System.in);
		numero = ler.nextInt();
		
		if (Math.abs(numero)%2 == 0) {System.out.println("é par");}
		else if (Math.abs(numero)%2 == 1) {System.out.println("é impar");}
	}

}
