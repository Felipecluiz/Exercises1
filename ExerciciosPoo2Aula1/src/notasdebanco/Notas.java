package notasdebanco;

import javax.swing.JOptionPane;

public class Notas {

	public static void main(String[] args) {

		
		
		
		
		
		int x=Integer.parseInt(JOptionPane.showInputDialog("quanto deseja sacar?"));
		
		int rec=x/100;
		x=x%100;
		int rec2=x/50;
		x=x%50;
		int rec5=x/20;
		x=x%20;
		
		int rec7=x/10;
		
		x=x%10;
		int rec9=x/5;
		x=x%5;
		int rec11=x/2;
		x=x%2;
		int rec13=x/1;
		
		
		
		System.out.println("notas de 100: "+rec+" notas de 50: "+rec2+" notas de 20: "+rec5+" notas de 10: "+rec7+" notas de 5: "
				+ ""+rec9+" notas de 2: "+rec11+" moedas de 1: "+rec13);
		
		
		
	}

}
