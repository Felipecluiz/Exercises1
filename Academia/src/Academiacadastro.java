import javax.swing.JOptionPane;
public class Academiacadastro {

	public static void main(String[] args) {
		// cadastro academia
		
		String nome, sexo,nameloweigh=null,nameupweigh=null,masculino="masculino",i = null,S="S",N="N",sexo1=null,ij;
		
		double weigh=0,meweigh=0,upweigh=0,receivweigh=0,absorv=0,absorvweigh=0,j,pause=1,condupweigh=0;
		j=0;
		while (pause != 0) {
		
			absorvweigh=weigh;
		
		absorv++;
		
		nome = JOptionPane.showInputDialog("Diga seu nome");
		sexo = JOptionPane.showInputDialog("sexo masculino ou feminino");
		weigh = Double.parseDouble(JOptionPane.showInputDialog("Diga seu peso"));
		
		
		
		if (j==0) {
		   meweigh=weigh;
		   nameloweigh=nome;
		}
		
		if (weigh <= meweigh && j !=0) {
			meweigh=weigh;
			nameloweigh=nome;
		}
		
		
		sexo1 = sexo.toLowerCase();
		
		if (weigh > upweigh && (sexo1.equals(masculino))) {
			upweigh=weigh;
			nameupweigh=nome;
			condupweigh++;
		}
		
		
			
			
		receivweigh = receivweigh + weigh;
		
		JOptionPane.showMessageDialog(null, "Media dos pesos é "+(receivweigh/absorv));
		
		JOptionPane.showMessageDialog(null, "Menor peso é do "+nameloweigh+" e o peso dele é "+meweigh);
		
		if (condupweigh > 0) {
		JOptionPane.showMessageDialog(null, "Maior peso é do "+nameupweigh+" e o peso dele é "+upweigh);
		}
		
		
		j++;
		
		//do {
		i = JOptionPane.showInputDialog(null, "deseja continuar? S ou N");
		ij=i.toUpperCase();
		//} while (ij.equals(S) || ij.equals(N));
		
		if (ij.equals(N)) {
			pause--;
		}
		
		else {continue;}
		
		
		}//fim do while

	}//fim da main

}
