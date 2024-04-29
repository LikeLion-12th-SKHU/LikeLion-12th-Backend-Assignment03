package Chapter07;

import java.util.Scanner;

public class Scanner_Ex10 {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);

        int totalcost = 0;
        while (true){
            System.out.println("1. 상품 입력, 2. 결제, 3. 프로그램 종료");
            int switchMod = input1.nextInt();

            int price, quantity, cost; String name;
            if(switchMod == 1)
            {
                System.out.print("상품의 이름을 입력하시오. : ");
                name = input1.next();
                System.out.print("상품의 가격을 입력하시오. : ");
                price = input1.nextInt();
                System.out.print("상품의 갯수을 입력하시오. : ");
                quantity = input1.nextInt();
                cost = price * quantity;
                System.out.printf("상품명 : %s 가격 : %d 수량 : %d 합계 : %d\n",name, price, quantity, cost);

                totalcost = price * quantity + cost;
            } else if (switchMod == 2) {
                System.out.printf("총 비용 : %d\n", totalcost);
                totalcost = 0;
            } else if (switchMod == 3) {
                System.out.print("프로그램을 종료합니다.");
                break;
            }else
                System.out.print("올바른 형식이 아닙니다. 다시 입력하세요.");

        }
    }
}
/*
1. 상품 입력, 2. 결제, 3. 프로그램 종료
1
상품의 이름을 입력하시오. : 배
상품의 가격을 입력하시오. : 1000
상품의 갯수을 입력하시오. : 1
상품명 : 배 가격 : 1000 수량 : 1 합계 : 1000
1. 상품 입력, 2. 결제, 3. 프로그램 종료
1
상품의 이름을 입력하시오. : 배
상품의 가격을 입력하시오. : 1000
상품의 갯수을 입력하시오. : 1
상품명 : 배 가격 : 1000 수량 : 1 합계 : 1000
1. 상품 입력, 2. 결제, 3. 프로그램 종료
2
총 비용 : 2000
1. 상품 입력, 2. 결제, 3. 프로그램 종료
2
총 비용 : 0
1. 상품 입력, 2. 결제, 3. 프로그램 종료
3
프로그램을 종료합니다.
 */