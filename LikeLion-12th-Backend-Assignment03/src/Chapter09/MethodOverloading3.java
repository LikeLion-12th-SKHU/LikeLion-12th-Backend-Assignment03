package Chapter09;

public class MethodOverloading3 {
    public static double add(double a, double b) {
        System.out.println("2번 호출");
        return a + b;
    }
    public static void main(String[] args) {
        System.out.println("1. " +  add(1,2));
        System.out.println("2. " +  add(4.24,4.29));
    }
}
/*
2번 호출
1. 3.0
2번 호출
2. 8.530000000000001
 */

