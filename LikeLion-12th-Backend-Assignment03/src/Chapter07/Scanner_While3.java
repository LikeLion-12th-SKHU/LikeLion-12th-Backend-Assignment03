package Chapter07;

import java.util.Scanner;

public class Scanner_While3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;

        while(true){
            System.out.print("정수를 입력하시오.(0을 입력하면 종료) : ");
            int number = input.nextInt();

            if(number == 0)
                break;

            sum += number;
        }
        System.out.printf("더한 숫자 : %d", sum);
    }
}
/*
정수를 입력하시오.(0을 입력하면 종료) :10
정수를 입력하시오.(0을 입력하면 종료) :20
정수를 입력하시오.(0을 입력하면 종료) :30
정수를 입력하시오.(0을 입력하면 종료) :50
정수를 입력하시오.(0을 입력하면 종료) :0
더한 숫자 : 110
*/
