package scanner.ex;

// import java.util.Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScannerEx4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("구구단의 단 수를 입력해주세요: ");
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        sb.append(n).append("단의 구구단: \n");
        for (int i = 1; i <= 9; i++) {
            sb.append(n).append(" x ").append(i).append(" = ").append(n * i).append("\n");
        }

        System.out.println(sb);
        br.close();

/*      Scanner input = new Scanner(System.in);

        System.out.print("구구단의 단 수를 입력하세요: ");
        int n = input.nextInt();

        System.out.println(n + "단의 구구단: ");
        for (int i = 1; i <= 9; i++) {
            System.out.println(n + " x " + i + " = " + n * i);
        }
        input.close();
*/
    }
}
