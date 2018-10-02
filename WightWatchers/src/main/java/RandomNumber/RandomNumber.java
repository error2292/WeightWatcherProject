package RandomNumber;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
	
	public static void main(String[]args) {
		int maxRange;
		Scanner sc =new Scanner (System.in);
		Random ran = new Random ();
		System.out.println("Please enter Max Range : ");
		maxRange = sc.nextInt();
		for(int loop=1;loop<=10;loop ++) {
			System.out.println(ran.nextInt(maxRange));
		}

		
		
	}

}

