package method;

public class MethodValue2 {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("1. changeNumber 호출 전, " + number); // 5
        changeValue(number); // number의 값을 읽는다
        System.out.println("4. changeNumber 호출 후, " + number); // 5

    }

    public static void changeValue(int number) {
        System.out.println("2. changeNumber 변경 전, number: "+ number); // 5
        number = number * 2; // 10
        System.out.println("3. changeNumber 변경 후, number: " + number); // 10
    }
}