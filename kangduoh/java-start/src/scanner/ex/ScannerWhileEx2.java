package scanner.ex;

// import java.util.Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScannerWhileEx2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.print("상품의 가격을 입력하세요 (-1을 입력하면 종료): ");
            int price = Integer.parseInt(br.readLine());

            if (price == -1) {
                System.out.println("프로그램을 종료합니다.");
                br.close();
                break;
            }

            System.out.print("구매하려는 수량을 입력하세요: ");
            int quantity = Integer.parseInt(br.readLine());

            int totalCost = price * quantity;
            StringBuilder sb = new StringBuilder();
            sb.append("총 비용: ").append(totalCost);
            System.out.println(sb);
        }

/*      Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("상품의 가격을 입력하세요 (-1을 입력하면 종료): ");
            int price = input.nextInt();

            if (price == -1) {
                System.out.println("프로그램을 종료합니다.");
                input.close();
                break;
            }

            System.out.print("구매하려는 수량을 입력하세요: ");
            int quantity = input.nextInt();

            int totalCost = price * quantity;
            System.out.println("총 비용: " + totalCost);
        }
*/
    }
}
