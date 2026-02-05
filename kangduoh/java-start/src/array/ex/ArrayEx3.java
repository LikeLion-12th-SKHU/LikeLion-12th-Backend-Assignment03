package array.ex;

// import java.util.Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayEx3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[5];

        System.out.println("5개의 정수를 입력하세요: ");
        for (int i = 0; i < 5; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        StringBuilder sb = new StringBuilder();
        sb.append("입력한 정수를 역순으로 출력: \n");
        for (int i = numbers.length - 1; i >= 0; i--) {
            sb.append(numbers[i]).append(i > 0 ? ", " : "");
        }

        System.out.println(sb);
        br.close();

/*      Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println("5개의 정수를 입력하세요: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("출력");
        for (int i = 4; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        scanner.close();
*/
    }
}
