package Chapter07;

import java.util.Scanner;

public class Scanner_Ex9 {
    public static void main(String[] args) {
        Scanner input1 = new Scanner(System.in);

        int sum = 0, input = 0,DivNum = 0;
        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요. : ");
        while ((input = input1.nextInt()) != -1){
            sum += input;
            DivNum++;
        }
        System.out.printf("입력한 숫자들의 합계 : %d\n", sum);
        System.out.printf("입력한 숫자들의 평균 : %.1f\n", (double)sum / DivNum);
    }
}
/*
숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요. :
1
2
3
4
-1
입력한 숫자들의 합계 : 10
입력한 숫자들의 평균 : 2.5
 */