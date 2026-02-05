package casting;

public class Casting2 {
    public static void main(String[] args) {
        double doubleVaue = 1.5;
        int intValue = 0;

        //intValue = doubleVaue; // 컴파일 오류 발생
        intValue = (int) doubleVaue; // 형변환
        System.out.println(intValue);
    }
}
