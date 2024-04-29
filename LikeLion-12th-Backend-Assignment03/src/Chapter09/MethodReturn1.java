package Chapter09;

public class MethodReturn1 {
    public static boolean odd(int i) {
        if (i % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(odd(2));
        System.out.println(odd(1));
    }
}
