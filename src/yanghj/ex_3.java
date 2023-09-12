package yhj;

import java.util.Scanner;

public class ex_3 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("게시물의 총 수를 입력해 주세요 >> ");
		double m = scanner.nextInt();
		System.out.print("한 페이지에 보여줄 게시물 수를 입력해 주세요 >> ");
		double n = scanner.nextInt();
		
		double a = m / n;
		
		double c = Math.ceil(a);
		double f = Math.floor(a);
		
		if (m < n) {
			System.out.println("페이지의 수는 : " + (int)c); 
		} else System.out.println("페이지의 수는 : " + (int)f);
	}
}