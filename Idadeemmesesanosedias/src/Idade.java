import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {

		int dias,meses,anos,anostotais;
		String nome;

	System.out.println ("Porfavor diga seu nome");
	Scanner ler3 = new Scanner(System.in);
	nome = ler3.nextLine();	
	
	
	System.out.println ("Informe o dia em que você nasceu, no formato 08..");
	Scanner ler = new Scanner(System.in);
	dias = ler.nextInt();
	//dias = ler.next.Double();
	
	System.out.println ("Informe o mes em que você nasceu, no formato 08..");
	Scanner ler1 = new Scanner(System.in);
	meses = ler1.nextInt();
	
	System.out.println ("Informe o ano em que você nasceu");
	Scanner ler2 = new Scanner(System.in);
	anos = ler2.nextInt();
	
	anostotais = 2017 - anos * 365; //transforma os anos em dias	
	
	
	
	int	 totaisemdias1 = Math.abs(meses * 30 + dias + anostotais);
	int totaisemmeses1 = Math.abs(totaisemdias1/30);
	int imprimirosanos = Math.abs(2017 - anos);
	System.out.println(nome);
	System.out.println(totaisemdias1);
	System.out.println(totaisemmeses1);
	System.out.println(imprimirosanos);
	
	}

}
