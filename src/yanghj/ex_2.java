package yanghj;

import java.util.Scanner;

public class ex_2 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		
		int sum = 0;
		
		while(true) {
			System.out.println("영수증에 적힌 총 금액을 적어주세요.");
			int X = scanner.nextInt();
			if(X < 1 || X > 1000000000) System.out.println("1과 1,000,000,000사이의 수를 적어주세요");
				
			
			System.out.println("영수증에 적힌 물건 종류의 수를 적어주세요.");
			int N = scanner.nextInt();
			if(N < 1 || N > 100) System.out.println("1과 100 사이의 수를 적어주세요");
					
			for(int index = 0; index < N; index++) {
				System.out.println("물건의 가격과 개수를 적어주세요.");
				int a = scanner.nextInt();
				int b = scanner.nextInt();
				if(a < 1 || a > 1000000) System.out.println("1과 1000000 사이의 수를 적어주세요");
				if(b < 1 || b > 10) System.out.println("1과 10 사이의 수를 적어주세요");
				
				sum = a*b + sum;
			}
				
			if(X == sum) {
				System.out.println("Yes");
				break;
			}
			else System.out.println("No"); break;
		}
	}
}