package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        //실행 결과 예시1 ```
        //입력받을 숫자의 개수를 입력하세요:3
        //3개의 정수를 입력하세요:
        //1
        //2
        //3
        //입력한 정수의 합계: 6
        //입력한 정수의 평균: 2.0 ```
        Scanner scanner = new Scanner(System.in);
        System.out.println("입력받을 숫자의 개수를 입력하세요: ");
        int inputNumber = scanner.nextInt();

        int [] score = new int[inputNumber];
        int sum = 0;
        double average = 0;

        System.out.println(inputNumber + "개의 정수를 입력하세요: ");
        for (int i = 0; i < score.length; i++) {
            score[i] = scanner.nextInt();
            sum += score[i];
        }
        average = (double) sum / score.length;
        System.out.println("입력한 정수의 합계: "+sum );
        System.out.println("입력한 정수의 평균: "+average);
    }
}
