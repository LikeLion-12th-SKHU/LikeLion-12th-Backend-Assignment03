package scanner;

import java.util.Scanner;

public class SannerWhile3 {
    public static void main(String[] args) {
        // Scanner 반복 예제3
        //사용자 입력을 받아 그 합계를 계산하는 프로그램을 작성해야 한다.
        //사용자는 한 번에 한 개의 정수를 입력할 수 있으며, 사용자가 0을 입력하면 프로그램은 종료된다.
        // 이 때, 프로그램이 종료될 때까지 사용자가 입력한 모든 정수의 합을 출력해야 한다
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true){
            System.out.println("정수 1개를 입력해주세요(0을 입력하면 종료): ");
            int inputNumber = scanner.nextInt();

            if(inputNumber == 0){
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            sum += inputNumber;
        }
        System.out.println("입력하신 정수의 합 : " + sum);
    }
}
