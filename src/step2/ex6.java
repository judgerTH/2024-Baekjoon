package step2;

import java.util.Scanner;

public class ex6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		int plusM = sc.nextInt();
		
		int min = 60 * h + m;
		min += plusM;
		
		int hour = (min / 60) % 24;
		int minuit = min % 60;
		
		System.out.println(hour + " " + minuit);
	}
}
