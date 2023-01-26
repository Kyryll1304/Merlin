package homework_eight;

public class Rugby {
    public static void main(String[] args) {
        int[] teamA = new int[25];
        int[] teamB = new int[25];
        int sumA = 0;
        int sumB = 0;
        for (int i = 0; i < 25; i++) {
            teamA[i] = (int) (Math.random() * (40 - 18 + 1) + 18);
            teamB[i] = (int) (Math.random() * (40 - 18 + 1) + 18);
            sumA += teamA[i];
            sumB += teamB[i];
        }
        int avgA = sumA / 25;
        int avgB = sumB / 25;
        System.out.println("Average age of Team A: " + avgA);
        System.out.println("Average age of Team B: " + avgB);
    }
}