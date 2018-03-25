import javax.swing.JOptionPane;
public class Adicaodematriz {

	public static void main(String[] args) {
		
		int l,c,x;
		
		
		l= Integer.parseInt(JOptionPane.showInputDialog("qtd de linhas da matriz"));
		c= Integer.parseInt(JOptionPane.showInputDialog("qtd de colunas da matriz"));
		
		int matriz[][] = new int[l][c];
		for (int i=0; i < l;i++) {
			for (int j=0; j < c;j++) {
				x= Integer.parseInt(JOptionPane.showInputDialog("preencha a matriz"));
				matriz[i][j]=x;		
			}
			
			
		}// fim do for
		
		int matrizb[][]= new int [l][c];
		
		for (int i=0; i < l;i++) {
			for (int j=0; j < c;j++) {
				
				matrizb[i][j] = matriz[i][j];		
			}
			
		}// fim do for
		
		
		
		for (int i=0; i < l;i++) {
			for (int j=0; j < c;j++) {
				
				matrizb[i][j] += matriz[i][j];		
			}
			
		}// fim do for
		
		String s = " ";
		for (int i=0; i < l;i++) {
			for (int j=0; j < c;j++) {
				
				s += matrizb[i][j]; 
				
				//System.out.println(matrizb[i][j]);	
				s += " ";
			}
			s += " ";
			
		}// fim do for
		
		JOptionPane.showMessageDialog(null, s);
		
		
		
		
		
		
		
	}

}
