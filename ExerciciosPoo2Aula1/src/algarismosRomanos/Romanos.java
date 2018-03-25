package algarismosRomanos;

import javax.swing.JOptionPane;

public class Romanos {

	public static void main(String[] args) {

		
		
		
		
		
		int x=Integer.parseInt(JOptionPane.showInputDialog("num para transformar em romano"));
	
		String num="";
		int rec1=x/1000;
		for (rec1=rec1; rec1 != 0; rec1--) {
			num += "M";
		} 
		
		x=x%1000;
		int rec2=x/500;
		for (rec2=rec2; rec2 != 0; rec2--) {
			num += "D";
		} 
		
		x=x%500;
		int rec3=x/100;
		
		for (rec3=rec3; rec3 != 0; rec3--) {
			num += "C";
		} 
		x=x%100;
		int rec4=x/50;
		for (rec4=rec4; rec4 != 0; rec4--) {
			num += "L";
		} 
		
		x=x%50;
		int rec5=x/10;
		for (rec5=rec5; rec5 != 0; rec5--) {
			num += "X";
		} 
		
		x=x%10;
		int rec6=x/9;
		for (rec6=rec6; rec6 != 0; rec6--) {
			num += "IX";
		} 
		
		
		x=x%9;
		int rec7=x/8;
		for (rec7=rec7; rec7 != 0; rec7--) {
			num += "VIII";
		} 
		
		x=x%8;
		int rec8=x/7;
		for (rec8=rec8; rec8 != 0; rec8--) {
			num += "VII";
		} 
		
		
		x=x%7;
		int rec9=x/6;
		for (rec9=rec9; rec9 != 0; rec9--) {
			num += "VI";
		} 
		
		
		
		x=x%6;
		
		
		int rec10=x/5;
		for (rec10=rec10; rec10 != 0; rec10--) {
			num += "V";
		} 
		
		
		x=x%5;
		int rec11=x/4;
		for (rec11=rec11; rec11 != 0; rec11--) {
			num += "IV";
		} 
		
		
		
		x=x%4;
		
		int rec12=x/1;
		for (rec12=rec12; rec12 != 0; rec12--) {
			num += "I";
		} 
		
		
		
		
		
		System.out.println(num);
		
		
		
	}

}
