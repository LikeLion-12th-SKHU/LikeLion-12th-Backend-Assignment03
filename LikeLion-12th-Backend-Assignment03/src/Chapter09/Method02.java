package Chapter09;

public class Method02 {
    public static int add(int num1, int num2) {
        System.out.println(num1 + " + " + num2 + " 연산 수행");
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {

        int sum1 = add(10, 10);
        System.out.println("결과값 : " + sum1);

        int sum2 = add(50, 10);
        System.out.println("결과값 : " + sum2);

        int sum3 = add(90, 20);
        System.out.println("결과값 : " + sum3);
    }
}
/*
10 + 10 연산 수행
결과값 : 20
50 + 10 연산 수행
결과값 : 60
90 + 20 연산 수행
결과값 : 110
 */