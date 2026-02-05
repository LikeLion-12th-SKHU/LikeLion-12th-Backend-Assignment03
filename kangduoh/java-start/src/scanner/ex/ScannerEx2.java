package scanner.ex;

// import java.util.Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScannerEx2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("하나의 정수를 입력하세요: ");
        int number = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        sb.append("입력한 숫자 ").append(number).append(number % 2 == 0 ? "는 짝수입니다." : "는 홀수입니다.");
        System.out.println(sb);
        br.close();

/*      Scanner scanner = new Scanner(System.in);

        System.out.print("하나의 정수를 입력하세요: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("입력한 숫자 " + number + "는 짝수입니다.");
        } else {
            System.out.println("입력한 숫자 " + number + "는 홀수입니다.");
        }
        scanner.close();
*/
    }
}
