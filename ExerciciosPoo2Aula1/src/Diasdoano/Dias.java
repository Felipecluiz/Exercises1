package Diasdoano;

import javax.swing.JOptionPane;

public class Dias {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//31--janeiro,marco,maio,julho,agosto,outubro,dezembro
		//30--abril,junho,setembro,novembro,
		//fevereiro	
		
		int d15=1;//DIA PRIMEIRO FOI QUINTA FEIRA
		int cont=1,contador=1;
		
		
		
		int rec=Integer.parseInt(JOptionPane.showInputDialog("digite o numero de dias"));
		
		for (int j=1;j < rec;j++){
		
			contador++;
			if (contador==8){
				contador=1;
			}
			
		
		}
		
		String days="";
		
		
		switch (contador){
		case 5:{days="segunda";break;}
		case 6:{days="terca";break;}
		case 7:{days="quarta";break;}
		case 1:{days="quinta";break;}
		case 2:{days="sexta";break;}
		case 3:{days="sabado";break;}
		case 4:{days="domingo";break;}
		
		}
	
	
		
		
		if(rec >= 1 && rec <= 31){
			for (int i=1;i < rec;i++){
				cont++;
			}
			JOptionPane.showMessageDialog(null,"janeiro "+"dia do mes "+cont+" "+days);
			
			cont=1;
		}
		
		if(rec >= 32 && rec <= 59){
			
			
			
			for (int i=32;i < rec;i++){
				cont++;
			}
			JOptionPane.showMessageDialog(null,"fevereiro "+"dia do mes "+cont+" "+days);
			
			cont=1;
			}
		if(rec >= 60 && rec <= 90){
			for (int i=60;i < rec;i++){
				cont++;
			}
			JOptionPane.showMessageDialog(null,"marco "+"dia do mes "+cont+" "+days);
			
			cont=1;
		}
		
		if(rec >= 91 && rec <= 120){
			for (int i=91;i < rec;i++){
				cont++;
			}
			JOptionPane.showMessageDialog(null,"abril "+"dia do mes "+cont+" "+days);
			
			cont=1;
		}
		
		
		if(rec >= 121 && rec <= 151){
			for (int i=121;i < rec;i++){
				cont++;
			}
			JOptionPane.showMessageDialog(null,"MAIO "+"dia do mes "+cont+" "+days);
			
			cont=1;		
			}
		
		if(rec >= 152 && rec <= 181){
			
			for (int i=152;i < rec;i++){
				cont++;
			}
			JOptionPane.showMessageDialog(null,"junho "+"dia do mes "+cont+" "+days);
			
			cont=1;
		
		}
		
		if(rec >= 182 && rec <= 212){
			
			for (int i=182;i < rec;i++){
				cont++;
			}
			JOptionPane.showMessageDialog(null,"julho "+"dia do mes "+cont+" "+days);
			
			cont=1;
			
			
		}
		if(rec >= 213 && rec <= 243){
			
			for (int i=213;i < rec;i++){
				cont++;
			}
			JOptionPane.showMessageDialog(null,"agosto "+"dia do mes "+cont+" "+days);
			
			cont=1;
			
			
		}
		if(rec >= 244 && rec <= 273){
			for (int i=244;i < rec;i++){
				cont++;
			}
			JOptionPane.showMessageDialog(null,"setembro "+"dia do mes "+cont+" "+days);
			
			cont=1;
		}
		if(rec >= 274 && rec <= 304){
			for (int i=274;i < rec;i++){
				cont++;
			}
			JOptionPane.showMessageDialog(null,"outubro "+"dia do mes "+cont+" "+days);
			
			cont=1;
		}
		if(rec >= 305 && rec <= 334){
			
			for (int i=305;i < rec;i++){
				cont++;
			}
			JOptionPane.showMessageDialog(null,"novembro "+"dia do mes "+cont+" "+days);
			
			cont=1;
			
			
			
		}
		if(rec >= 335 && rec <= 365){
			
			for (int i=335;i < rec;i++){
				cont++;
			}
			JOptionPane.showMessageDialog(null,"dezembro "+"dia do mes "+cont+" "+days);
			
			cont=1;
			
			
		}		
		
		
		
		
	}

}

