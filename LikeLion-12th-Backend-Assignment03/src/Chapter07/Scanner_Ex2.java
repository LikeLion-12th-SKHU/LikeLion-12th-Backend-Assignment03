package Chapter07;

import java.util.Scanner;

public class Scanner_Ex2 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);

        System.out.print("정수 하나를 입력하시오. : ");
        int number = scanner1.nextInt();

        if(number % 2 == 0){
            System.out.printf("%d는 짝수입니다.", number);
        }else{
            System.out.printf("%d는 홀수입니다.", number);
        }
    }
}
/*
정수 하나를 입력하시오. : 5
5는 홀수입니다.

정수 하나를 입력하시오. : 4
4는 짝수입니다.
 */