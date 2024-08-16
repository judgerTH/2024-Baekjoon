package step3;

import java.util.Scanner;

public class ex5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int input = a/4;
		for(int i=0; i<input; i++) {
			System.out.print("long ");
		}
		System.out.println("int");
	}
}
