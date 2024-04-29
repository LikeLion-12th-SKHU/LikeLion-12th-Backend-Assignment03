package Chapter08;

public class ArrayRef3 {
    public static void main(String[] args) {
        int[] score = new int[] {100, 40, 90, 75, 15};

        for(int i = 0; i < score.length; i++){
            System.out.println("학생 " + (i + 1) + " 점수 : " + score[i]);
        }
    }
}
