package step5;

import java.util.Scanner;

public class ex5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int length = sc.nextInt();
		String num = sc.next();
		int sum = 0;
		for(int i=0; i<length; i++) {
			sum += num.charAt(i)-'0';
		}
		System.out.println(sum);
		
	}
}
