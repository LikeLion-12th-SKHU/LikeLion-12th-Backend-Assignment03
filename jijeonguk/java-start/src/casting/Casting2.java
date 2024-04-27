package casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleValue = 1.5;
        int intVailue = 0;

        // intVailue = doubleValue; //컴파일 오류 발생
        intVailue = (int )doubleValue; // 명시적 형변환
        System.out.println(intVailue);

        System.out.println((int) 10.5);
    }
}
