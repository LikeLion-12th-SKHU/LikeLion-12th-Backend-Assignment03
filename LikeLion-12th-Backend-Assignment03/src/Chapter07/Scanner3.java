package Chapter07;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);

        System.out.print("첫번째 숫자를 입력하시오. : ");
        int num1 = scanner1.nextInt();

        System.out.print("두번째 숫자를 입력하시오. : ");
        int num2 = scanner1.nextInt();

        if(num1 != num2){
           int A = num1 > num2 ? num1 : num2;
            System.out.printf("더 큰 수는 %d입니다.",A);
        }
        else
            System.out.println("두 수는 서로 같습니다.");
    }
}
/*
첫번째 숫자를 입력하시오. : 40
두번째 숫자를 입력하시오. : 40
두 수는 서로 같습니다.

첫번째 숫자를 입력하시오. : 40
두번째 숫자를 입력하시오. : 50
더 큰 수는 50입니다.
 */
