package Barras;

import javax.swing.JOptionPane;

public class Comprimento {

	public static void main(String[] args) {
	
		int a=0;
		double b=0;
		do {
			
			a = Integer.parseInt(JOptionPane.showInputDialog("digite o tamanho de 'A', deve ser maior que 'B'"));
			
			b = Double.parseDouble(JOptionPane.showInputDialog("digite o tamanho de 'B', deve ser menor que 'A'"));
			
			
		}while(a < b || a == b);
		
		int cont=0;
		for (cont=20; a > b; cont++) {
			a=a+2;
			b=b+(3.5);
			System.out.println(a);
			System.out.println(b);
				
			
			
		}
		
		System.out.println(cont);
		
		
		
	}

}
