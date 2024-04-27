package scanner;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {
        // Scanner 반복 예제2
        //첫 번째 숫자와 두 번째 숫자를 더해서 출력하는 프로그램을 개발하자.
        //첫 번째 숫자와 두 번째 숫자 모두 0을 입력하면 프로그램을 종료한다.
        //프로그램은 반복해서 실행된다.

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int number = scanner.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int number2 = scanner.nextInt();

            if (number == 0 && number2 == 0){
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            int sum = number + number2;
            System.out.println("두 수의 덧셈은 : " + sum);

        }
    }
}
