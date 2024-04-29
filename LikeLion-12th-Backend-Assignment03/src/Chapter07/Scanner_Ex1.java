package Chapter07;

import java.util.Scanner;

public class Scanner_Ex1 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);

        System.out.print("이름을 입력하시오. : ");
        String name = scanner1.next();

        System.out.print("이름을 입력하시오. : ");
        int age = scanner1.nextInt();

        System.out.printf("당신의 이름은 %s이고, 나이는 %d살 입니다.", name, age);

    }
}
/*
이름을 입력하시오. : 한장수
이름을 입력하시오. : 21
당신의 이름은 한장수이고, 나이는 21살 입니다.
 */
