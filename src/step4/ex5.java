package step4;

import java.util.Scanner;

public class ex5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 바구니
		int N = sc.nextInt();
		// 공
		int M = sc.nextInt();
		int arr[] = new int[N];
				
		// 
		for(int i=0; i<M; i++) {
			// 바구니 시작
			int I = sc.nextInt();
			// 바구니 끝
			int J = sc.nextInt();
			// 공 번호
			int K = sc.nextInt();
			
			for(int j=I-1; j<J; j++) {
				arr[j] = K;
			}
		}
		
		for(int k=0; k<arr.length; k++) {
			System.out.println(arr[k] + " ");
		}
	}
}



