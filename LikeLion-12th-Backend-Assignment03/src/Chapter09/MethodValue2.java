package Chapter09;

public class MethodValue2 {
    public static void changeNumber(int number) {
        System.out.println("2. changeNumber 변경 전, number : " + number);
        number = number * 2;
        System.out.println("3. changeNumber 변경 후, number : " + number);
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println("1. changeNumber 호출 전, number : " + number);
        changeNumber(number);
        System.out.println("4. changeNumber 호출 후, number : " + number);
    }
}
/*
1. changeNumber 호출 전, number : 5
2. changeNumber 변경 전, number : 5
3. changeNumber 변경 후, number : 10
4. changeNumber 호출 후, number : 5
*/
