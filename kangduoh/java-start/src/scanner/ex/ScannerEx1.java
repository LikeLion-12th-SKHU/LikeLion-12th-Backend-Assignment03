package scanner.ex;

// import java.util.Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScannerEx1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("당신의 이름을 입력하세요: ");
        String name = br.readLine();

        System.out.print("당신의 나이를 입력하세요: ");
        int age = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        sb.append("당신의 이름은 ").append(name).append("이고, 나이는 ").append(age).append("살입니다.");
        System.out.println(sb);
        br.close();

/*      Scanner scanner = new Scanner(System.in);

        System.out.print("당신의 이름을 입력하세요: ");
        String name = scanner.nextLine();

        System.out.print("당신의 나이를 입력하세요: ");
        int age = scanner.nextInt();

        System.out.println("당신의 이름은 " + name + "이고, 나이는 " + age + "살입니다.");
        scanner.close();
*/
    }
}
