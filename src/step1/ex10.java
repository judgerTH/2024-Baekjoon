package step1;

import java.util.Scanner;

public class ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c, d, e;
		a = sc.nextInt();
		b = sc.nextInt();
		// 1의 자리수
		c = b%10;
		// 10의 자리수
		d = (b%100)/10;
		// 100의 자리수
		e = b/100;
		System.out.println(a*c);
		System.out.println(a*d);
		System.out.println(a*e);
		System.out.println(a*b);
	}
}
