package easyhoon;

import java.util.Scanner;

public class Ex_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int total = scanner.nextInt();
        int count = scanner.nextInt();

        for (int index = 0; index < count; index++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            total = total - (a * b);
            System.out.println(total);
        }
        if (total == 0){
            System.out.println("yes");
        }
        else System.out.println("no");
    }
    
}
