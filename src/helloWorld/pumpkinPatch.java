package helloWorld;

import java.util.Scanner;

public class pumpkinPatch {

	public static void counterMethod(int counter) {	
			counter++;
			System.out.println(counter);
	//	return counter;
	}
	
	public static void main(String[] args) {
		Scanner inputScanner = new Scanner(System.in);
		String input = inputScanner.next();

		
		int score1 = 0;
		int score2 = 0;
		
		boolean pumpkinClicked = true;
		
		for (int i = 0; i<10 && pumpkinClicked == true; i++) {
			counterMethod(score1);
		//	System.out.println(score1);

		}
		
		while (pumpkinClicked == true) {
			counterMethod(score1);
		}

	}

}
