package step4;

import java.util.Scanner;

public class ex9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int arr[] = new int[N];
		
		int temp = 0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		
		for(int i=0; i<M; i++) {
			// 시작 바구니번호
			int num1 = sc.nextInt()-1;
			// 끝나는 바구니번호
			int num2 = sc.nextInt()-1;

			while(num1<num2) {
				temp = arr[num1];
				arr[num1] = arr[num2];
				arr[num2] = temp;
				num1++;
				num2--;
			}
		}
		for(int k : arr) {
			System.out.print(k);
		}
	}
}
