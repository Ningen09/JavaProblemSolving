package easyhoon;

import java.util.Scanner;

public class 윤년 {
   public static void main(String[] args) {
      
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("확인할 년도를 입력하세요 : ");
      int year = scanner.nextInt();
      
      if(year >= 1 && year <= 4000) {
         if(year % 4 == 0 && year % 100 != 0) System.out.println("윤년");
         else if (year % 400 == 0) System.out.println("윤년"); 
         else System.out.println("평년");   
      }else System.out.println("1 ~ 4000 사이 값을 입력해주세요");
   }
}