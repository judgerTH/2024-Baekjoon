package step4;

import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int num = sc.nextInt();
		int arr[] = new int[a];
		
		for(int i=0; i<a; i++) {
			int input = sc.nextInt();
			arr[i] = input;
		}
		for(int i=0; i<a; i++) {
			if(arr[i] < num) {
				System.out.println(arr[i]);
			}
		}
	}
}
