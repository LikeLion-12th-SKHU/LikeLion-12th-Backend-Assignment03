package array.ex;

// import java.util.Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayEx4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[5];
        int sum = 0;

        System.out.println("5개의 정수를 입력하세요: ");
        for (int i = 0; i < 5; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
            sum += numbers[i];
        }

        double average = (double) sum / 5;
        StringBuilder sb = new StringBuilder();
        sb.append("입력한 정수의 합계: ").append(sum).append("\n입력한 정수의 평균: ").append(average);
        System.out.println(sb);
        br.close();

/*      Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        int sum = 0;
        double average;

        System.out.println("5개의 정수를 입력하세요: ");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        average = (double) sum / 5;
        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + average);
        scanner.close();
*/
    }
}
