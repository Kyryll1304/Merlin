package homework_eight;

import java.util.Arrays;

public class Rugby {
    private static int[] teamGenerator(){
        int[] team = new int[25];
        for (int i = 0; i < 25; i++) {
            team[i] = (int) (Math.random() * (40 - 18 + 1) + 18);
        }
        return team;
    }
    private static int meanCalculator(int[]x) {
        int sum=0;
        for (int i = 0; i < 25; i++) {
            sum += x[i];
        }

        return  sum / 25;
    }
    public static void main(String[] args) {
        int[] teamA = teamGenerator();
        int[] teamB = teamGenerator();

        System.out.println(Arrays.toString(teamA));
        System.out.println(Arrays.toString(teamB));

        int avgA = meanCalculator(teamA);
        int avgB = meanCalculator(teamB);
        System.out.println("Average age of Team A: " + avgA);
        System.out.println("Average age of Team B: " + avgB);
    }
}