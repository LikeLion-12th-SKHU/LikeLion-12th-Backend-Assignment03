package Chapter07;

import java.util.Scanner;

public class Scanner_While2 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("첫 번째 숫자와 두 번째 숫자 모두 0을 입력하면 프로그램을 종료합니다.");
        while(true){
            System.out.print("첫 번째 숫자를 입력하시오. : ");
            int num1 = scanner1.nextInt();

            System.out.print("두 번째 숫자를 입력하시오. : ");
            int num2 = scanner1.nextInt();
            if(num1 == 0 && num2 == 0){
                System.out.print("프로그램을 종료합니다.");
                break;
            }

            int sum = num1 + num2;
            System.out.printf("두 수의 합 : %d\n", num1 + num2);
        }
    }
}
/*
첫 번째 숫자와 두 번째 숫자 모두 0을 입력하면 프로그램을 종료합니다.
첫 번째 숫자를 입력하시오. : 10
두 번째 숫자를 입력하시오. : 20
두 수의 합 : 30
첫 번째 숫자를 입력하시오. : 50
두 번째 숫자를 입력하시오. : 40
두 수의 합 : 90
첫 번째 숫자를 입력하시오. : 0
두 번째 숫자를 입력하시오. : 0
프로그램을 종료합니다.
 */