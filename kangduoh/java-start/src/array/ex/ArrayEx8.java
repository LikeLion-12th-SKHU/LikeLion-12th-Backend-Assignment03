package array.ex;

// import java.util.Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArrayEx8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("학생수를 입력하세요: ");
        int studentCount = Integer.parseInt(br.readLine());

        int[][] scores = new int[studentCount][3];
        String[] subjects = {"국어", "영어", "수학"};

        for (int i = 0; i < studentCount; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요: ");
            for (int j = 0; j < 3; j++) {
                System.out.print(subjects[j] + " 점수: ");
                scores[i][j] = Integer.parseInt(br.readLine());
            }
        }

        for (int i = 0; i < studentCount; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += scores[i][j];
            }
            double average = total / 3.0;
            StringBuilder sb = new StringBuilder();
            sb.append(i + 1).append("번 학생의 총점: ").append(total).append(", 평균: ").append(average);
            System.out.println(sb);
        }
        br.close();

/*      Scanner scanner = new Scanner(System.in);
        System.out.print("학생수를 입력하세요: ");
        int studentCount = scanner.nextInt();

        int[][] scores = new int[studentCount][3];
        String[] subjects = {"국어", "영어", "수학"};

        for (int i = 0; i < studentCount; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요: ");
            for (int j = 0; j < 3; j++) {
                System.out.print(subjects[j] + " 점수: ");
                scores[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < studentCount; i++) {
            int total = 0;
            for (int j = 0; j < 3; j++) {
                total += scores[i][j];
            }
            double average = total / 3.0;
            System.out.println((i + 1) + "번 학생의 총점: " + total + ", 평균: " + average);
        }
        scanner.close();
*/
    }
}
