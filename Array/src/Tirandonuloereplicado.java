import javax.swing.JOptionPane;

public class Tirandonuloereplicado {

	public static void main(String[] args) {
		
		
		int m,l=10,conta=0,pif1=0,pif2=0,receiv=0;
		
		int matrizp[]= new int[l];
		
		for (int j=0; j < l ;j++) {
			m= Integer.parseInt(JOptionPane.showInputDialog("preencha vetor"));
			
			matrizp[j]=m;		
		}//fim do for
		
		   for (int c=0; c < l;c++){
			
			for (int i=c+1; i < l;i++) {
				if (matrizp[i] == matrizp[c]) {
					pif1++;
					for (int h=i; h < l-1;h++) {
						matrizp[h]=matrizp[h+1];
					}
				}
			}
					
		}//fim do for
		
		
		
		   for (int c=0; c < l;c++){
				
				for (int i=c+1; i < l;i++) {
					if (matrizp[i] == matrizp[c]) {
						pif1++;
						for (int h=i; h < l-1;h++) {
							matrizp[h]=matrizp[h+1];
						}
					}
				}
						
			}//fim do for
			
		   
		   
		   
		   
		
		
            for (int cont : matrizp) {
			
			
				if (cont == 0) {
					pif2++;
					for (int h=conta; h < l-1;h++) {
						matrizp[h]=matrizp[h+1];
					}
					}
				conta++;
				}
					conta=0;
            for (int cont : matrizp) {
					if (cont < 0) {
						pif2++;
						for (int h=conta; h < l-1;h++) {
							matrizp[h]=matrizp[h+1];
						}
						}
					conta++;
					}
					
            
            
            
           // System.out.println(pif1);
            //7System.out.println(pif2);
			
		
		//for (int u=l-(pif1+pif2); u < l;u++) {
			
			
			//matrizp[u]=0;
		//}
            
		for (int r=0; r < l;r++) {
			
			if (receiv != matrizp[r]) {
			System.out.println(matrizp[r]);
			}
			receiv=matrizp[r];
		}
                
            
		
	}//fim main

}
