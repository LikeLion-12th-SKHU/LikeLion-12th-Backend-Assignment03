package method.ex;

public class MethodEx1Ref {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("평균값: ").append(average(1, 2, 3)).append("\n평균값: ").append(average(15, 25, 35));
        System.out.println(sb);
    }

    public static double average(int a, int b, int c) {
        int sum = a + b + c;
        return sum / 3.0;
    }
}
