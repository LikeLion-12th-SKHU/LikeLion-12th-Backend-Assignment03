package array.ex;

public class ArrayEx1Ref {
    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50};

        int result = 0;
        for (int i = 0; i < students.length; i++) {
            result += students[i];
        }
        double avg = (double) result / 5;
        System.out.println("점수 총합: " + result);
        System.out.println("점수 평균: " + avg);
    }
}
