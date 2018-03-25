import java.util.Scanner;
public class Array {
	public static void main(String[] args) {
		// verificando array repetido
	
	int v,k,absorv2=0,absorv3=0,h=-1,i=0,imprimir=0,ab=0,cancer=0;
	
	int receiv[] = new int[1000];
	
	for (i=0; i > h ;i++) {
		
		
		System.out.println("preencha a matriz com quantos numeros quiser, tecle 0 para parar");
		Scanner ler = new Scanner(System.in);
		cancer=i;
		receiv[i] = ler.nextInt();
		if (receiv[i] == 0) {
			break;}
	}
	

	
	 
    
    for (int j=0; j < cancer+1; j++){
    	
    	for (int g=0; g < cancer+1;g++) {
    	 ab = j;
    		ab++;
  if (receiv[j]==receiv[ab]) {imprimir++;}  
  
	  }
    	
    }//fim do for
    
    if (imprimir > 0) { 
	System.out.println("tem algum numero repetido");
    }
    else {System.out.println("n tem");}
	
	
	}//fim da main
	
	

}
