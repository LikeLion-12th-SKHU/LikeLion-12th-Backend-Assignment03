package Chapter06;

public class Casting4 {
    public static void main(String[] args) {
        int div1 = 10 / 4; // 2
        System.out.printf("div1 = %d\n", div1);

        double div2 = 10 / 4; // 1.0
        System.out.printf("div2 = %f\n", div2);

        double div3 = 10.0 / 4; // 2.5
        System.out.printf("div1 = %f\n", div3);

        double div4 = (double)10 / 4; // 2.5
        System.out.printf("div1 = %f\n", div4);
    }
}
/*
div1 = 2
div2 = 2.000000
div1 = 2.500000
div1 = 2.500000
 */
