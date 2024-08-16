package step3;

import java.util.Scanner;

public class ex4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int totalCost = sc.nextInt();
		int totalCount = sc.nextInt();
		int sum = 0;
		for(int i=0; i<totalCount; i++) {
			int cost = sc.nextInt();
			int count = sc.nextInt();
			sum += cost*count;
		}
		if(totalCost == sum) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}
