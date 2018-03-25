import java.util.Scanner;
public class Salarioli {

	public static void main(String[] args) {
		// salario liquido

		int servente=10,copeira=15,auxadm=20;
		 String nome,funcao,func1 = "Servente",func2= "Copeira",func3 = "Auxiliar_Administrativo";
		 
		  System.out.println("Qual o nome do funcionario");
		   Scanner ler = new Scanner(System.in);
		    nome = ler.nextLine();
		
		  System.out.println("Qual a função dele na empresa: Servente, Copeira ou Auxiliar_Administrativo?");
		   Scanner ler1 = new Scanner(System.in);
		    funcao = ler.nextLine();
		
		    if (funcao.equals(func1)) {System.out.println("Então ele é Servente e ganha "+((160*servente)*0.85)+" E o nome dele eh "+nome+" E o bruto dele é "+servente*160);}
		    
		    if (funcao.equals(func2)) {System.out.println("Então ele é Copeira e ganha "+((160*copeira)*0.85)+" E o nome dele eh "+nome+" E o bruto dele é "+copeira*160);}
		    
		    if (funcao.equals(func3)) {System.out.println("Então ele é Aux Adm e ganha "+((160*auxadm)*0.85)+" E o nome dele eh "+nome+" E o bruto dele é "+auxadm*160);}
		    		
	}

}
