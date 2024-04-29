package Chapter06;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2_147_483_647; //int의 최댓값
        long maxIntOver = 2_147_483_648L;

        int intValue = 0;

        intValue = (int) maxIntValue;
        System.out.printf("maxIntValue Casting : %d\n", intValue);

        intValue = (int) maxIntOver;
        System.out.printf("maxIntOver Casting : %d\n", intValue);
    }
}
/*
maxIntValue Casting : 2147483647
maxIntOver Casting : -2147483648
 */
