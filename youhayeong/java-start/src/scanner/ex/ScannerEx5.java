package scanner.ex;

import java.util.Scanner;

public class ScannerEx5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 숫자를 입력하세요:");
        int a = sc.nextInt();

        System.out.print("두 번째 숫자를 입력하세요:");
        int b = sc.nextInt();

        // num1이 num2보다 큰 경우, 두 숫자를 교환
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        System.out.print("두 숫자 사이의 모든 정수:");
        for (int i = a; i <= b; i++) {
            System.out.print(i);
            if (i != b) {
                System.out.print(",");
            }
        }
    }
}
