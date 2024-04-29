package casting;

public class Casting1 {
    public static void main(String[] args) {
        //형변환
        //작은 범위에서 큰 범위로는 당연히 값을 넣을 수 있다.
        //예) int long double
        //큰 범위에서 작은 범위는 다음과 같은 문제가 발생할 수 있다.
        //소수점 버림
        //오버플로우
        int intValue = 10;
        long LongValue;
        double doubleValue;

        LongValue = intValue; // int -> long
        System.out.println("LongValue = " + LongValue);

        doubleValue = intValue;// int -> double
        System.out.println("doubleValue= " + doubleValue);

        doubleValue = 20000L; // long -> double
        System.out.println("doubleValue2 = " + doubleValue);


    }
}
