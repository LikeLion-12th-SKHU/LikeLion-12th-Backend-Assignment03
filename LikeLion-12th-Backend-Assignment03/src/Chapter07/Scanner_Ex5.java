package Chapter07;

public class Scanner_Ex5 {
    public static void main(String[] args) {
        int a = 10, b = 20, temp;

        temp = b;
        b = a;
        a = temp;

        System.out.printf("a : %d \nb : %d", a, b);
    }
}
/*
a : 20
b : 10

 */
