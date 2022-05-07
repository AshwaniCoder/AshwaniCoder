package gettingStarted;

import java.util.Scanner;

public class IfElseCondition {
	
	public static void main (String[] args) {
		Scanner sc =new Scanner(System.in);
		//feeling 1=pyar 2=hawas other=timepass
		int feeling=sc.nextInt();
		if(feeling==1) {
			System.out.println("Kushboo");
		}
		else if(feeling==2) {
			System.out.println("Mahima");
		}
		else {
			System.out.println("First year girl");
		}
		sc.close();
		
//		//
//		if(Contion) {statement}
//		else if(contion) {Statement}
//		else {statement}
	}

}
