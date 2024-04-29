package Chapter07;

import java.util.Scanner;

public class Scanner_Ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int temp;

        System.out.print("첫 번째 수를 입력하시오. : ");
        int number1 = input.nextInt();

        System.out.print("두 번째 수를 입력하시오. : ");
        int number2 = input.nextInt();

        if(number1 > number2) { // num1 7, num2 : 5
            temp = number1;
            number1 = number2;
            number2 = temp;
        }
        System.out.printf("두 숫자 사이의 모든 정수 : ");
        for (int i = number1; i <= number2; i++){
            System.out.print(i);
            if(i != number2){
                System.out.print(", ");
            }
        }
    }
}
/*
첫 번째 수를 입력하시오. : 5
두 번째 수를 입력하시오. : 9
두 숫자 사이의 모든 정수 : 5, 6, 7, 8, 9

첫 번째 수를 입력하시오. : 7
두 번째 수를 입력하시오. : 3
두 숫자 사이의 모든 정수 : 3, 4, 5, 6, 7
 */
