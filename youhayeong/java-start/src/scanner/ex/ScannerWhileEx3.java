package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0;
        int sum = 0;
        int count = 0;

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요: ");
        while ((n = sc.nextInt()) != -1) { //n이 -1이 아닐때까지 반복
            sum += n;
            count++;
        }

        double avg = (double) sum / count;
        System.out.println("입력한 숫자들의 합계: " + sum + "\n" + "입력한 숫자들의 평균: " + avg);
    }
}
