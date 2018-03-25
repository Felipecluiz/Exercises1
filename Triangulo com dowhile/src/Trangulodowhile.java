import java.util.Scanner;
public class Trangulodowhile {

	public static void main(String[] args) {
		int base,h,store;
		
		System.out.println("Quantos triangulos voce quer calcular a area?");
		Scanner ler = new Scanner(System.in);
		store = ler.nextInt();
		
		do {
			System.out.println("medida da base");
			Scanner ler1 = new Scanner(System.in);
			base = ler1.nextInt();
			
			System.out.println("ALTURA");
			Scanner ler2 = new Scanner(System.in);
			h = ler2.nextInt();
				System.out.println("area do triangulo "+(base*h/2));
				store--;
		} while (store != 0);
		
		
		
	}

}
