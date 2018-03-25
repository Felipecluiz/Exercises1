import java.util.Scanner;
public class Determinar {

	public static void main(String[] args) {
		// determinar se é adulto, adolescente ou criança
		
		int idade;
		System.out.println("diga sua idade");
		Scanner ler = new Scanner(System.in);
		idade = ler.nextInt();
		if (idade >= 0) {
		if (idade < 12) {System.out.println("voce é uma crianca cotoca");}
		else if (idade > 12 && idade < 18) {System.out.println("voce é um adolescente cotoco");}
		else if (idade >= 18) {System.out.println("voce é um adulto");}
		}
		else {System.out.println("fale sua idade real plx");}
	}

}
