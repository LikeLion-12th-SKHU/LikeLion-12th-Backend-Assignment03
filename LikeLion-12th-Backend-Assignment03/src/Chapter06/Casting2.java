package Chapter06;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 3.14;
        int intValue;

        //intValue = doubleValue; //컴파일 오류 발생, incompatible types: possible lossy conversion from double to int.
        intValue = (int)doubleValue;
        System.out.printf("intValue : %d", intValue); // intValue : 3
    }
}
