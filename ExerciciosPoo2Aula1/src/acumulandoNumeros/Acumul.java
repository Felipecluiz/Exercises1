package acumulandoNumeros;
import java.util.ArrayList;

import javax.swing.JOptionPane;
public class Acumul {

	public static void main(String[] args) {
		
		
		
		ArrayList <Integer> use= new ArrayList<Integer>();
		
		int acumulandomaior=0;
		int acumulandomenor=0;
		int rec=0;
		int cont=0;
		int acumul=0,sum=0,acumulLow=0;
		do {
			
			rec=Integer.parseInt(JOptionPane.showInputDialog("digite valores"));
			acumul=rec;
			use.add(rec);
			cont++;
			sum+=rec;
			
			int media=rec/cont;
			
			if (cont==1) {
				acumulandomaior=rec;
			}
			
			
			else if (rec > acumulandomaior) {
				 acumulandomaior=rec;
			}
			
			
			
			if (cont==1) {
				acumulandomenor=rec;
			}
			
			else if (rec < acumulandomenor) {
				acumulandomenor=rec;
			}
			
			System.out.println("media "+media+" maior numero "+acumulandomaior+" menor numero "+acumulandomenor+"\n"+" tamanho do list "+use.size()+" soma total dos valores "+sum+" quantidade de valores "+cont);
			
			
			
			
		}while (rec != 0);
		
		
		

	}


}
