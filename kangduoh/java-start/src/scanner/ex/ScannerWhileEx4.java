package scanner.ex;

// import java.util.Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScannerWhileEx4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int totalCost = 0;

        while (true) {
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int option = Integer.parseInt(br.readLine());

            switch (option) {
                case 1:
                    System.out.print("상품명을 입력하세요: ");
                    String product = br.readLine();

                    System.out.print("상품의 가격을 입력하세요: ");
                    int price = Integer.parseInt(br.readLine());

                    System.out.print("구매 수량을 입력하세요: ");
                    int quantity = Integer.parseInt(br.readLine());

                    totalCost += price * quantity;
                    StringBuilder sb = new StringBuilder();
                    sb.append("상품명: ").append(product).append(" 가격: ").append(price).append(" 수량: ").append(quantity).append(" 합계: ").append(price * quantity);
                    System.out.println(sb);
                    break;
                case 2:
                    System.out.println("총 비용: " + totalCost);
                    totalCost = 0; // 결제 후 총 비용 초기화
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    br.close();
                    return;
                default:
                    System.out.println("올바른 옵션을 선택해주세요.");
            }
        }

/*      Scanner input = new Scanner(System.in);
        int totalCost = 0;

        while (true) {
            System.out.println("1: 상품 입력, 2: 결제, 3: 프로그램 종료");
            int option = input.nextInt();

            if (option == 1) {
                input.nextLine();

                System.out.print("상품명을 입력하세요: ");
                String product = input.nextLine();

                System.out.print("상품의 가격을 입력하세요: ");
                int price = input.nextInt();

                System.out.print("구매 수량을 입력하세요: ");
                int quantity = input.nextInt();

                totalCost += price * quantity;
                System.out.println("상품명: " + product + " 가격: " + price + " 수량: " + quantity + " 합계: " + price * quantity);
            } else if (option == 2) {
                System.out.println("총 비용: " + totalCost);
                totalCost = 0;
            } else if (option == 3) {
                System.out.println("프로그램을 종료합니다.");
                input.close();
                break;
            } else {
                System.out.println("올바른 옵션을 선택해주세요.");
            }
        }
*/
    }
}
