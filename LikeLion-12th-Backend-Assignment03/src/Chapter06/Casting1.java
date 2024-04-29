package Chapter06;

public class Casting1 {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double doubleValue;

        longValue = intValue;
        System.out.printf("longValue =  %d\n", longValue);

        doubleValue = intValue;
        System.out.printf("doubleValue = %.1f\n", doubleValue);

        doubleValue = 20L;
        System.out.printf("doubleValue2 = %.1f\n", doubleValue);
    }
}
/*
*
**
***
****
*****
10
 */