package method;

public class MethodCasting1 {
    public static void main(String[] args) {
        //메서드와 형변환
        //메서드를 호출할 때도 형변환이 적용된다.
        //메서드 호출과 명시적 형변환, 자동 형변환에 대해 알아보자.

        double number = 1.5;
        printNumber((int)number);

    }

    public static void printNumber(int n){
        System.out.println("숫자 : " + n);
    }

}
