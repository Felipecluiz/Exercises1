import javax.swing.JOptionPane;
import java.util.Scanner;
public class Link {

	public static void main(String[] args) {
		// maior nm de cliques
		
		int t,i=0,receiv=0,result;
		
		while (i != 1) {
		do {
			receiv = Integer.parseInt(JOptionPane.showInputDialog(null,"digite o numero de cliques do link 3,"
					+ " a quantidade de cliques nao deve ser menor que 1 nem maior que 1000"));
		}while (receiv < 1 || receiv > 1000);
		
			JOptionPane.showMessageDialog(null,"o numero de cliques do link 1 foi "+(receiv*6));
			
		    result = JOptionPane.showConfirmDialog(null,"Deseja continuar ? ","Continuar?",JOptionPane.YES_NO_OPTION);   
			  
			if(result ==JOptionPane.YES_OPTION)  {
				i=0;
			}
			else {i++;}
			
			
			
		}//fim do while
	}//fim da main

}
