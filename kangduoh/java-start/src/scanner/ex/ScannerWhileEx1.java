package scanner.ex;

// import java.util.Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScannerWhileEx1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료): ");
            String name = br.readLine();

            if (name.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                br.close();
                break;
            }

            System.out.print("나이를 입력하세요: ");
            int age = Integer.parseInt(br.readLine());

            StringBuilder sb = new StringBuilder();
            sb.append("입력한 이름: ").append(name).append(", 나이: ").append(age);
            System.out.println(sb);
        }

/*      Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("이름을 입력하세요 (종료를 입력하면 종료): ");
            String name = input.nextLine();

            if (name.equals("종료")) {
                System.out.println("프로그램을 종료합니다.");
                input.close();
                break;
            }

            System.out.print("나이를 입력하세요: ");
            int age = input.nextInt();
            input.nextLine(); // 숫자 입력 후의 줄바꿈 처리

            System.out.println("입력한 이름: " + name + ", 나이: " + age);
        }
*/
    }
}
