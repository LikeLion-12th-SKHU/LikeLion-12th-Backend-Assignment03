package Chapter07;

import java.util.Scanner;

public class Scanner_Ex4 {
    public static void main(String[] args) {
        Scanner inputNum = new Scanner(System.in);

        System.out.print("구구단의 단수를 입력하시오. : ");
        int stage = inputNum.nextInt();

        System.out.printf("%d단의 구구단\n", stage);
        for(int i = 1; i <= 9; i++){
            System.out.printf("%d x %d = %d\n",stage, i, stage * i);
        }
    }
}
/*
구구단의 단수를 입력하시오. : 9
9단의 구구단
9 x 1 = 9
9 x 2 = 18
9 x 3 = 27
9 x 4 = 36
9 x 5 = 45
9 x 6 = 54
9 x 7 = 63
9 x 8 = 72
9 x 9 = 81
 */
