package array.ex;

// import java.util.Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayEx6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int n = Integer.parseInt(br.readLine());
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println(n + "개의 정수를 입력하세요: ");
        for (int i = 0; i < n; i++) {
            numbers.add(Integer.parseInt(br.readLine()));
        }

        Collections.sort(numbers);  // 오름차순 정렬
        StringBuilder sb = new StringBuilder();
        sb.append("가장 작은 정수: ").append(numbers.get(0)).append("\n가장 큰 정수: ").append(numbers.get(n - 1));
        System.out.println(sb);
        br.close();

/*      Scanner scanner = new Scanner(System.in);
        System.out.print("입력 받을 숫자의 개수를 입력하세요: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];
        int minNumber, maxNumber;

        System.out.println(n + "개의 정수를 입력하세요: ");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        minNumber = maxNumber = numbers[0];
        for (int i = 1; i < n; i++) {
            if (numbers[i] < minNumber) {
                minNumber = numbers[i];
            }
            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            }
        }

        System.out.println("가장 작은 정수: " + minNumber);
        System.out.println("가장 큰 정수: " + maxNumber);
        scanner.close();
*/
    }
}
