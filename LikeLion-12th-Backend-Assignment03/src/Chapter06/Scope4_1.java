package Chapter06;

public class Scope4_1 {

    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        int repeatNum = 3;

        while (i <= repeatNum) {
            sum += i;
            System.out.printf("i = %d, sum = %d\n", i, sum);
            i++;
        }
    }
}
/*
i = 1, sum = 1
i = 2, sum = 3
i = 3, sum = 6
 */
