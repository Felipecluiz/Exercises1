import javax.swing.JOptionPane;

public class Fatorial {

	public static void main(String[] args) {
		
		
		int rec=Integer.parseInt(JOptionPane.showInputDialog("numero"));
		int acumul=rec;
		for (int i=(rec-1);i > 0;i-- ) {
			
			acumul=acumul*i;
			
			
		}
		
		System.out.println(acumul);
		
	}

}
