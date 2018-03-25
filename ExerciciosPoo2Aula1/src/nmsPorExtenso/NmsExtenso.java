package nmsPorExtenso;

public class NmsExtenso {

	public static void main(String[] args) {

		
		int rec=2234;
		String num="";
		
		if (rec/10000 > 0) {
			int x=rec/10000;
			
			switch (x) {
			case 2:{num+="vinte ";break;}
			case 3:{num+="trinta ";break;}
			case 4:{num+="quarenta ";break;}
			case 5:{num+="cinquenta ";break;}
			case 6:{num+="sessenta ";break;}
			case 7:{num+="setenta ";break;}
			case 8:{num+="oitenta ";break;}
			case 9:{num+="noventa ";break;}
			
			
			}
			
			rec=rec%10000;
			num+=" e ";
		}
		
		
		
		if (rec/1000 > 0) {
			//num +="e";
			int x=rec/1000;
			switch (x) {
			case 2:{num+="dois ";break;}
			case 3:{num+="tres ";break;}
			case 4:{num+="quatro ";break;}
			case 5:{num+="cinco ";break;}
			case 6:{num+="seis ";break;}
			case 7:{num+="sete ";break;}
			case 8:{num+="oito ";break;}
			case 9:{num+="nove ";break;}
			
			
			}
			num +=" mil ";
		rec=rec%1000;	
		}
		
		
		if (rec/100 > 0) {
			//num +="e";
			int x=rec/100;
			switch (x) {
			case 2:{num+="duzentos ";break;}
			case 3:{num+="tresentos ";break;}
			case 4:{num+="quatrocentos ";break;}
			case 5:{num+="quinhentos ";break;}
			case 6:{num+="seiscentos ";break;}
			case 7:{num+="setecentos ";break;}
			case 8:{num+="oitocentos ";break;}
			case 9:{num+="novecentos ";break;}
			
			
			}
			num +=" e ";
		rec=rec%100;	
		}
		

		if (rec/10 > 0) {
			//num +="e";
			int x=rec/10;
			switch (x) {
			case 2:{num+="vinte ";break;}
			case 3:{num+="trinta ";break;}
			case 4:{num+="quarenta ";break;}
			case 5:{num+="cinquenta ";break;}
			case 6:{num+="sessenta ";break;}
			case 7:{num+="setenta ";break;}
			case 8:{num+="oitenta ";break;}
			case 9:{num+="noventa ";break;}
			
			
			}
			num +=" e ";
		rec=rec%10;	
		}
		
		
		if (rec/1 > 0) {
			//num +="e";
			int x=rec/1;
			switch (x) {
			case 2:{num+="dois ";break;}
			case 3:{num+="tres ";break;}
			case 4:{num+="quatro ";break;}
			case 5:{num+="cinco ";break;}
			case 6:{num+="seis ";break;}
			case 7:{num+="sete ";break;}
			case 8:{num+="oito ";break;}
			case 9:{num+="nove ";break;}
			
			
			}
			//num +="e";
		//rec=rec%10;	
		}
		
		
		System.out.println(num);
		
		
		
	}

}
