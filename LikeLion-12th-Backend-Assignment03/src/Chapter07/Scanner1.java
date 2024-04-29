package Chapter07;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요. : ");
        String str1 = scanner.nextLine(); // 입력을 String으로 가져온다.
        System.out.printf("입력한 문자열 : %s\n", str1);

        System.out.print("정수를 입력하세요. : ");
        int str2 = scanner.nextInt();
        System.out.printf("입력한 숫자 : %d\n", str2);

        System.out.print("실수를 입력하세요. : ");
        double str3 = scanner.nextDouble();
        System.out.printf("입력한 실수 : %f\n", str3);
    }
}
/*
문자열을 입력하세요. : 15
입력한 문자열 : 15
정수를 입력하세요. : 12
입력한 숫자 : 12
실수를 입력하세요. : 12.5
입력한 실수 : 12.500000
 */