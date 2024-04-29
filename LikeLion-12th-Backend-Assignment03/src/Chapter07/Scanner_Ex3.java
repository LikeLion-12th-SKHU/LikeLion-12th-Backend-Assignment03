package Chapter07;

import java.util.Scanner;

public class Scanner_Ex3 {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);

        System.out.print("음식 이름을 입력하시오. : ");
        String foodName = input1.nextLine();

        System.out.print("음식 가격을 입력하세요. : ");
        int foodPrice = input1.nextInt();

        System.out.print("주문할 수량을 입력하세요. : ");
        int foodQuantity = input1.nextInt();

        int totalPrice = foodPrice * foodQuantity;

        System.out.printf("%s %d개를 주문하셨습니다. 총 가격은 %d원입니다.",foodName, foodQuantity, totalPrice);
    }
}
/*
음식 이름을 입력하시오. : 치킨
음식 가격을 입력하세요. : 19000
주문할 수량을 입력하세요. : 2
치킨 2개를 주문하셨습니다. 총 가격은 38000원입니다.
 */
