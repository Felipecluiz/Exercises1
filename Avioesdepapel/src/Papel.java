import javax.swing.JOptionPane;

public class Papel {

	public static void main(String[] args) {
		// avioes papel

		int c,p,f,compare;
		
		do {
		c = Integer.parseInt(JOptionPane.showInputDialog(null,"quantidade de competidores"
				+ " esse nm � c e c deve estar entre 1<= c e c <= 1000"));
		} while (1 > c || c >1000);
		
		do {
			p = Integer.parseInt(JOptionPane.showInputDialog(null,"quantidade de folhas compradas pela diretora"
					+ " esse nm � p e p deve estar entre 1<= p e p <= 1000"));
			} while (1 > p || p >1000);
			
		do {
			f = Integer.parseInt(JOptionPane.showInputDialog(null,"quantidade de folhas que cada competidor deve receber"
					+ " esse nm � f e f deve estar entre 1<= f e f <= 1000"));
			} while (1 > f || f >1000);
			
		compare=(c*f);
		
		if (compare <= p) {
			
			JOptionPane.showMessageDialog(null, "S");
		}
		
		
		else {
			JOptionPane.showMessageDialog(null, "N");
			}
		

	}

}
