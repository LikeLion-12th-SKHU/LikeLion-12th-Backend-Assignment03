package scanner.ex;

// import java.util.Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScannerWhileEx3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0, count = 0, input = 0;
        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요: ");

        while ((input = Integer.parseInt(br.readLine())) != -1) {
            sum += input;
            count++;
        }

        double average = (double) sum / count;
        StringBuilder sb = new StringBuilder();
        sb.append("입력한 숫자들의 합계: ").append(sum).append("\n").append("입력한 숫자들의 평균: ").append(average);
        System.out.println(sb);
        br.close();

/*      Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;
        int input = 0;

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요: ");

        while ((input = scanner.nextInt()) != -1) {
            sum += input;
            count++;
        }

        double average = (double) sum / count;
        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 평균: " + average);
        scanner.close();
*/
    }
}
