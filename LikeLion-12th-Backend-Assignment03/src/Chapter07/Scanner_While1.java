package Chapter07;

import java.util.Scanner;

public class Scanner_While1 {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);

        while (true) {
            System.out.print("문자를 입력하세요.(exit : 종료) : ");
            String str1 = scanner1.nextLine();
            if (str1.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }
            System.out.println("입력한 문자열 : " + str1);
        }
    }
}
/*
문자를 입력하세요.(exit : 종료) : 12
입력한 문자열 : 12
문자를 입력하세요.(exit : 종료) : 사십팔
입력한 문자열 : 사십팔
문자를 입력하세요.(exit : 종료) : Hello
입력한 문자열 : Hello
문자를 입력하세요.(exit : 종료) : exit
프로그램을 종료합니다.
 */
