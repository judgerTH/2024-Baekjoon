package step4;

import java.util.Scanner;

public class ex6 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 바구니 개수
		int N = sc.nextInt();
		// 바꾸는 횟수
		int M = sc.nextInt();
		int temp;
		
		// 현재 바구니에 들은 공의 번호는 바구니의 번호이다.
		int arr[] = new int[N];
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		
		for(int j=0; j<M; j++) {
			
            int I = sc.nextInt();
            int J = sc.nextInt();

            // 바꿀 바구니의 인덱스번호
            temp = arr[I-1];
            
            arr[I-1] = arr[J-1];
            arr[J-1] = temp;
        }
		
		for(int k : arr) {
			System.out.print(k + " ");
		}
	}
	
}
