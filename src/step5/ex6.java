package step5;

import java.util.Scanner;

public class ex6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		// -1로 된 알파벳 갯수26개 배열 생성
		int arr[] = new int[26];
		for(int i=0; i<26; i++) {
			arr[i] = -1;
		}		
		
		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if (arr[ch - 'a'] == -1) {
				arr[ch - 'a'] = i;
			}
		}
		for(int a : arr) {
			System.out.print(a + " ");
		}
	}
}
