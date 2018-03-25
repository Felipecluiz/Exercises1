import javax.swing.JOptionPane;
public class Somadiagonalmatriz {

	public static void main(String[] args) {
		
		int l,x=0,res=1,mul=0,m;
		
		l= Integer.parseInt(JOptionPane.showInputDialog("qtd de linhas da matriz e colunas"));
		l=l+1;
		int matrizp[][] = new int[l][l];
		
		for (int i=1; i < l;i++) {
			for (int j=1; j < l;j++) {
				m= Integer.parseInt(JOptionPane.showInputDialog("preencha a matriz"));
				
				matrizp[i][j]=m;		
			}
		}//fim for
		
		for (int i=1; i < l;i++) {
			for (int j=1; j < l;j++) {
				if (i == j) {
				x +=matrizp[i][j];		
				}
				
			}
		}// fim for diagonal principal
		
		for (int i=1; i < l;i++) {
			for (int j=l-1; j >= 1;j--) {
				
				
				if (i == res && i==1 && res==1) {
				mul = matrizp[i][j]+mul;		
				}
				if (i==res && i != 1) {
					mul=(matrizp[i][j]*mul);
				}
				res++;
				
			}
			res=1;
		}// fim for diagonal secundaria
			
		//System.out.println(x);
		//System.out.println(mul);
		JOptionPane.showMessageDialog(null, "soma "+x+" produto "+mul);
		
		
		
		
		

	}

}
