package method.ex;

public class MethodEx1Ref {
    public static void main(String[] args) {
        System.out.println("평균값: " + average(1, 2, 3));
        System.out.println("평균값: " + average(10, 50, 60));
    }

    public static double average(int a, int b, int c) {
        int sum = a + b + c;
        double average = sum / 3.0;
        return average;
    }
}
