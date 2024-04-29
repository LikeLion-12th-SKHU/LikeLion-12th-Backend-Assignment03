package method;

public class MethodReturn1 {
    public static void main(String[] args) {
        boolean result = odd(10);
        System.out.println(result);

    }
    public static boolean odd(int i){
        if (i % 2 == 1) {
            return true;
            //return 문을 만나면 그 즉시 메서드를 빠져나간다.
            //return 문을 만나면 그 즉시 해당 메서드를 빠져나간다
        } else {
            return false;
        }
    }
}
