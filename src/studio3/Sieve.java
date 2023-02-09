package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("What is n?");
		int n = in.nextInt(); 
		
	boolean[] original = new boolean [n + 1];
	for (int i =1; i<original.length; i++) {
		original[i]=true;
	}
	for (int factor =2; factor<original.length; factor++) {
		for (int multiple=factor*2; multiple<original.length; multiple+=factor) {
			original[multiple] = false; 
		}
			//(i/2 = true) 
 
	}
	for (int i=2; i<n; i++) {
		if (original[i] == true) {
			System.out.print(i + ", ");
		}
	}
}
}
