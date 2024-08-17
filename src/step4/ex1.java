package step4;

import java.util.Scanner;

public class ex1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int arr[] = new int[a];
		
		for(int i=0; i<a; i++) {
			int num = sc.nextInt();
			arr[i] = num;
		}
		
		int input = sc.nextInt();
		int sum = 0;
		for(int i=0; i<a; i++) {
			if(arr[i] == input) {
				sum ++;
			}
		}
		System.out.println(sum);
	}
}
