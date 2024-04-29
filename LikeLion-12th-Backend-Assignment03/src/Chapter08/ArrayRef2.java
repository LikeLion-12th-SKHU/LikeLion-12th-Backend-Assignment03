package Chapter08;

public class ArrayRef2 {
    public static void main(String[] args) {
        int[] score = new int[5];

        score[0] = 100;
        score[1] = 40;
        score[2] = 90;
        score[3] = 75;
        score[4] = 15;

        for(int i = 0; i < score.length; i++){
            System.out.println("학생 " + (i + 1) + " 점수 : " + score[i]);
        }
    }
}
