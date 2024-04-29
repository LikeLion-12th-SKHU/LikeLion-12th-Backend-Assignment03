package Chapter07;

import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Scanner_Ex7 {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);

        while (true){

            System.out.print("이름을 입력하세요. (종료를 입력하면 종료됨): ");
            String name = input1.next();

            if(name.equals("종료")){
                System.out.print("프로그램을 종료합니다.");
                break;
            }
            System.out.print("나이를 입력하세요. : ");
            int age = input1.nextInt();

            System.out.printf("입력한 이름 : %s, 나이 %d\n", name, age);
        }
    }
}
/*
이름을 입력하세요. (종료를 입력하면 종료됨): 한장수
나이를 입력하세요. : 21
입력한 이름 : 한장수, 나이 21
이름을 입력하세요. (종료를 입력하면 종료됨): 김김김
나이를 입력하세요. : 31
입력한 이름 : 김김김, 나이 31
이름을 입력하세요. (종료를 입력하면 종료됨): 종료
프로그램을 종료합니다.
 */
