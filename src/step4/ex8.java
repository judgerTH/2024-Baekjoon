package step4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class ex8 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// HashSet은 중복이 불가하다는 특징을 지님
		HashSet<Integer> hs = new HashSet<Integer>();
 
		for (int i = 0; i < 10; i++) {
			hs.add(Integer.parseInt(br.readLine()) % 42);
		}
		br.close();
		System.out.print(hs.size()); //HashSet의 값 출력
	}
}
