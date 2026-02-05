package array.ex;

// import java.util.Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ArrayEx5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("입력 받을 숫자의 개수를 입력하세요: ");
        int count = Integer.parseInt(br.readLine());

        ArrayList<Integer> numbers = new ArrayList<>();
        int sum = 0;

        System.out.println(count + "개의 정수를 입력하세요: ");
        for (int i = 0; i < count; i++) {
            numbers.add(Integer.parseInt(br.readLine()));
            sum += numbers.get(i);
        }

        double average = (double) sum / count;
        StringBuilder sb = new StringBuilder();
        sb.append("입력한 정수의 합계: ").append(sum).append("\n입력한 정수의 평균: ").append(average);
        System.out.println(sb);
        br.close();

/*      Scanner scanner = new Scanner(System.in);
        System.out.print("입력 받을 숫자의 개수를 입력하세요: ");
        int count = scanner.nextInt();

        int[] numbers = new int[count];
        int sum = 0;
        double average;

        System.out.println(count + "개의 정수를 입력하세요: ");
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        average = (double) sum / count;
        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + average);
        scanner.close();
*/
    }
}
