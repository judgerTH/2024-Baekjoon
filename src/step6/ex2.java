package step6;

import java.util.Scanner;

public class ex2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[6];
		for(int i=0; i<arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print(1-arr[0] + " ");
		System.out.print(1-arr[1] + " ");
		System.out.print(2-arr[2] + " ");
		System.out.print(2-arr[3] + " ");
		System.out.print(2-arr[4] + " ");
		System.out.print(8-arr[5] + " ");
	}
}
