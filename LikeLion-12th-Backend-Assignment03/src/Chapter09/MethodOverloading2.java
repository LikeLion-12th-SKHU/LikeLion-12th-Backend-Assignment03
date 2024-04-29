package Chapter09;

public class MethodOverloading2 {
    public static void myMethod(int a, double b) {
        System.out.println("int a, double b");
    }
    public static void myMethod(double a, int b) {
        System.out.println("double a, int b");
    }

    public static void main(String[] args) {
        myMethod(1,1.2);
        myMethod(1.2,1);
    }
}
/*
int a, double b
double a, int b
 */
