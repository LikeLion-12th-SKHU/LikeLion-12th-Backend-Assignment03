package method;

public class MethodReturn1 {
    /*public static void main(String[] args) {
        boolean result = odd(2);
        System.out.println(result);
    }
    public static boolean odd(int i) {
        if (i % 2 == 1) {
            return true;
        }
    }
} */ // 이렇게 실행하면 컴파일 오류 발생
    public static void main(String[] args) {
        boolean result = odd(2);
        System.out.println(result);
    }

    public static boolean odd(int i) {
        if (i%2 == 1) {
            return true;
        } else {
            return false;
        }
    }
}

