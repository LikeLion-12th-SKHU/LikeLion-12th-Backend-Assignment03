package Chapter07;

import java.util.Scanner;

public class Scanner_Ex8 {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);

        while (true){
            System.out.print("상품의 가격을 입력하세요.(-1을 입력하면 종료) : ");
            int price = input1.nextInt();

            if(price == -1){
                System.out.print("프로그램을 종료합니다.");
                break;
            }
            System.out.print("구매하려는 수량을 입력하세요.(-1을 입력하면 종료) : ");
            int quantity = input1.nextInt();

            if(quantity == -1){
                System.out.print("프로그램을 종료합니다.");
                break;
            }
            int total = price * quantity;
            System.out.printf("총 비용 : %d\n", total);
        }
    }
}
/*
상품의 가격을 입력하세요.(-1을 입력하면 종료) : 7500
구매하려는 수량을 입력하세요.(-1을 입력하면 종료) : 2
총 비용 : 15000
상품의 가격을 입력하세요.(-1을 입력하면 종료) : 15000
구매하려는 수량을 입력하세요.(-1을 입력하면 종료) : 4
총 비용 : 60000
상품의 가격을 입력하세요.(-1을 입력하면 종료) : -1
프로그램을 종료합니다.
*/