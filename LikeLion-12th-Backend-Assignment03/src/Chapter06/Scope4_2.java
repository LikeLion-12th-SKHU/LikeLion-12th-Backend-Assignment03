package Chapter06;

public class Scope4_2 {
    public static void main(String[] args) { // repeatNum, sum의 할당
        int repeatNum = 3;
        int sum = 0;

        for(int i = 1; i <= repeatNum; i++) { // i의 할당
            sum += i;
            System.out.printf("i = %d, sum = %d\n", i, sum);
        }
        // i의 종료
    }
    // repeatNum, sum의 종료
}
/*
i = 1, sum = 1
i = 2, sum = 3
i = 3, sum = 6
 */
