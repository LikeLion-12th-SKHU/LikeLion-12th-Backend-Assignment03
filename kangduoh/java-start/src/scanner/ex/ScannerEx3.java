package scanner.ex;

// import java.util.Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScannerEx3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("음식 이름을 입력해주세요: ");
        String foodName = br.readLine();

        System.out.print("음식의 가격을 입력해주세요: ");
        int foodPrice = Integer.parseInt(br.readLine());

        System.out.print("음식의 수량을 입력해주세요: ");
        int foodQuantity = Integer.parseInt(br.readLine());

        int totalPrice = foodPrice * foodQuantity;
        StringBuilder sb = new StringBuilder();
        sb.append(foodName).append(" ").append(foodQuantity).append("개를 주문하셨습니다. 총 가격은 ").append(totalPrice).append("원입니다.");
        System.out.println(sb);
        br.close();

/*      Scanner input = new Scanner(System.in);

        System.out.print("음식 이름을 입력해주세요: ");
        String foodName = input.nextLine();

        System.out.print("음식의 가격을 입력해주세요: ");
        int foodPrice = input.nextInt();

        System.out.print("음식의 수량을 입력해주세요: ");
        int foodQuantity = input.nextInt();

        int totalPrice = foodPrice * foodQuantity;
        System.out.println(foodName + " " + foodQuantity + "개를 주문하셨습니다. 총 가격은 " + totalPrice + "원입니다.");
        input.close();
*/
    }
}
