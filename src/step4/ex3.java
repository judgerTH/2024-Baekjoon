package step4;

import java.util.Scanner;

public class ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int arr[] = new int[a];
		
		for(int i=0; i<a; i++) {
			int num = sc.nextInt();
			arr[i] = num;
		}
		
		int min = arr[0];
		int max = arr[0];
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println(min + " " + max);
	}
}
