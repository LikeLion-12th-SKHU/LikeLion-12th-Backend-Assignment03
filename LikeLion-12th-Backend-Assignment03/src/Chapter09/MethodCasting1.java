package Chapter09;

public class MethodCasting1 {
    public static void printNumber(int n){
        System.out.println("숫자 : " + n);
    }

    public static void main(String[] args) {
        double number = 1.5;
        printNumber((int) number); //double형을 int형에 대입하여 데이터 손실, 컴파일 오류발생
    }
}
