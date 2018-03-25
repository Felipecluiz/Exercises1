import javax.swing.JOptionPane;
import java.util.Scanner;
public class Arraydesubstituirposiçoes {

	public static void main(String[] args) {
		
		int x,receber1=0,receber2=0,receber3=0,h=0;
		int array[]= new int[20];
		
		
		
		for (int i=0; i < array.length-1;i++) {
			x= Integer.parseInt(JOptionPane.showInputDialog("digite os 20 numeros da mtz"));
			array[i]=x;
		}
		
		receber2=array.length-1;
		for (int j=0; j < 10;j++) {
			receber1=array[j];// primeiro valor
			receber3=array[receber2];//armazeno o ultimo valor
			array[receber2]=receber1;//coloco o valor 1 na 19 posiçao
			array[j]=receber3;//coloco o ultimo valor na posicao 0
			receber2--;
		}
		
		for (int i=1; i < array.length;i++) {
			System.out.println(array[i]);
		}
		
		
		/*String s = "";
        for (int a = 20; a >= 1; a--) {
           s += array[h] + " ";
           //s += a + "\n"; // caso queira um numero em cada linha
           h++;
       }
       JOptionPane.showMessageDialog(null, s);   */
      
		
	}

}
