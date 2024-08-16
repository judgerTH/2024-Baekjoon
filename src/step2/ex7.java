package step2;

import java.util.Scanner;

public class ex7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		int max;
		if (a==b && b==c) {
			System.out.println(10000 + a*1000);
		}else if((a==b && a!=c) || (a!=b && a==c) ) {
			System.out.println(1000 + a*100);
		}else if((b==c && b!=a)) {
			System.out.println(1000 + b*100);
		}else {
			if(a>b && a>c) {
				max = a;
			}else if(b>a && b>c) {
				max = b;
			}else {
				max = c;
			}
			System.out.println(100*max);
		}
	}
}

