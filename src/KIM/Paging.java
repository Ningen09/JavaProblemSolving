package KIM;

import java.util.Scanner;


public class Paging {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("총 게시글 수: ");
		int totalPage = scanner.nextInt();
		
		System.out.println("한 페이지 게시글 수: ");
		int page = scanner.nextInt();
		
		if (totalPage % page == 0)
			System.out.println("총 페이지: " + totalPage / page);
		else
			System.out.println(totalPage / page + 1 + "페이지 입니다.");
		
	}

}
