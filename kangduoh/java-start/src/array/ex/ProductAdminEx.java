package array.ex;

// import java.util.Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProductAdminEx {
    public static void main(String[] args) throws IOException {
        final int maxProducts = 10;
        String[] productNames = new String[maxProducts];
        int[] productPrices = new int[maxProducts];
        int productCount = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.print("1. 상품 등록 | 2. 상품 목록 | 3. 종료\n메뉴를 선택하세요: ");
            int menu = Integer.parseInt(br.readLine());

            switch (menu) {
                case 1:
                    if (productCount >= maxProducts) {
                        System.out.println("더 이상 상품을 등록할 수 없습니다.");
                        continue;
                    }

                    System.out.print("상품 이름을 입력하세요: ");
                    productNames[productCount] = br.readLine();

                    System.out.print("상품 가격을 입력하세요: ");
                    productPrices[productCount] = Integer.parseInt(br.readLine());

                    productCount++;
                    break;
                case 2:
                    if (productCount == 0) {
                        System.out.println("등록된 상품이 없습니다.");
                        continue;
                    }

                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < productCount; i++) {
                        sb.append(productNames[i]).append(": ").append(productPrices[i]).append("원\n");
                    }
                    System.out.println(sb);
                    break;
                case 3:
                    System.out.println("프로그램을 종료합니다.");
                    br.close();
                    return;
                default:
                    System.out.println("잘못된 메뉴를 선택하셨습니다.");
            }
        }

/*      int maxProducts = 10;
        String[] productNames = new String[maxProducts];
        int[] productPrices = new int[maxProducts];
        int productCount = 0;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("1. 상품 등록 | 2. 상품 목록 | 3. 종료\n메뉴를 선택하세요: ");
            int menu = scanner.nextInt();
            scanner.nextLine();

            if (menu == 1) {
                if (productCount >= maxProducts) {
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    continue;
                }

                System.out.print("상품 이름을 입력하세요: ");
                productNames[productCount] = scanner.nextLine();

                System.out.print("상품 가격을 입력하세요: ");
                productPrices[productCount] = scanner.nextInt();

                productCount++;
            } else if (menu == 2) {
                if (productCount == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }
                for (int i = 0; i < productCount; i++) {
                    System.out.println(productNames[i] + ": " + productPrices[i] + "원");
                }
            } else if (menu == 3) {
                System.out.println("프로그램을 종료합니다.");
                scanner.close();
                break;
            } else {
                System.out.println("잘못된 메뉴를 선택하셨습니다.");
            }
        }
*/
    }
}
