package Chapter08;

public class ArrayRef1 {
    public static void main(String[] args) {
        int[] score = new int[5];

        score[0] = 100;
        score[1] = 40;
        score[2] = 90;
        score[3] = 75;
        score[4] = 15;

        for(int i = 0; i < 5; i++){
            System.out.println("학생 " + (i + 1) + " 점수 : " + score[i]);
        }
    }
}
/*
학생 1 점수 : 100
학생 2 점수 : 40
학생 3 점수 : 90
학생 4 점수 : 75
학생 5 점수 : 15
 */