package Chapter07;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하시오. : ");
        int num1 = scanner1.nextInt();

        System.out.print("두 번째 숫자를 입력하시오. : ");
        int num2 = scanner1.nextInt();

        System.out.printf("두 숫자의 합 : %d", num1 + num2);
    }
}
