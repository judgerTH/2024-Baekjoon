package step3;

import java.util.Scanner;

public class ex7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int arr[] = new int[a];
		for(int i=0; i<a; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			arr[i] = num1+num2;
		}
		for(int i=0; i<a; i++) {
			System.out.println("Case #" + (i+1) + ": " + arr[i]);
		}
	}
}
