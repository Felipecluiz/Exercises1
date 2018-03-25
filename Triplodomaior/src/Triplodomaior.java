import java.util.Scanner;
public class Triplodomaior {

	public static void main(String[] args) {
//triplo do maior
		int valor1,valor2,valormaior = 0;
		
		System.out.println("diga o valor do primeiro");
		Scanner ler1 = new Scanner(System.in);
		valor1 = ler1.nextInt();
		
		System.out.println("diga o valor do segundo");
		Scanner ler2 = new Scanner(System.in);
		valor2 = ler2.nextInt();
		if (valor1 != 0 && valor2 != 0) {
		if (valor1 > valor2 && valor1 >= 0 && valor1 <= 1000) {valormaior = valor1*3;}
		else if (valor1 < valor2 && valor2 >= 0 && valor2 <= 1000) {valormaior = valor2*3;}
		}
		else {System.out.printf("voce digitou numeros iguais");}
		
		System.out.println("primeiro valor "+valor1);
		System.out.println("segundo valor "+valor2);
		System.out.println("valor triplicado "+valormaior);
		
		
	}

}
