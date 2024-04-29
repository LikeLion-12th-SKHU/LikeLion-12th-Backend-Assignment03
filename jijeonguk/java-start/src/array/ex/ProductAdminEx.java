package array.ex;

import java.util.Scanner;

public class ProductAdminEx {
    public static void main(String[] args) {
        // 상품 관리 프로그램 만들기
        int maxProduct = 10;
        Scanner scanner = new Scanner(System.in);

        String [] productName = new String[10];
        int [] productPrice = new int[10];
        int productCount = 0;

        while (true) {
            System.out.print("1. 상품 등록 | 2. 상품 목록 | 3. 종료\n메뉴를 선택하세요:");
            int option = scanner.nextInt();
            scanner.nextLine(); // 엔터때문에 추가한거.

            if (option == 1) {
                if (productCount >= maxProduct) {
                    System.out.println("더이상 상품을 등록할 수 없습니다.");
                    continue;
                }
                System.out.print("상품 이름을 입력하세요: ");
                productName[productCount] = scanner.nextLine();

                System.out.print("상품 가격을 입력하세요: ");
                productPrice[productCount] = scanner.nextInt();
                productCount++;

            } else if (option == 2) {
                if (productCount == 0){
                    System.out.println("등록하신 상품이 없습니다.");
                    continue;
                }
                for (int i = 0; i < productCount; i++) {
                    System.out.println(productName[i] +":"+ productPrice[i]+"원");
                }

            } else if (option == 3) {
                System.out.println("프로그램을 종료합니다");
                break;
            }
        }
    }
}
