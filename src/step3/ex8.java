package step3;

import java.util.Scanner;

public class ex8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int arr1[] = new int[a];
		int arr2[] = new int[a];
		for(int i=0; i<a; i++) {
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			arr1[i] = num1;
			arr2[i] = num2;
		}
		for(int i=0; i<a; i++) {
			System.out.println("Case #" + (i+1) + ": " + arr1[i] + " + " + arr2[i] + " = " + (arr1[i]+arr2[i]));
		}
	}
}
