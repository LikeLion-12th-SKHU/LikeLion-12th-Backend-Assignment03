package Chapter09;

public class MethodOverloading1 {
    public static int add(int a, int b) {
        System.out.println("1번 호출");
        return a + b;
    }

    public static int add(int a, int b, int c) {
        System.out.println("2번 호출");
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println("1번 : " + add(10,20));
        System.out.println("2번 : " + add(10,20,30));
    }
}
/*
1번 호출
1번 : 30
2번 호출
2번 : 60
 */
