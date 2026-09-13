package tutorial05;
import java.util.Arrays;
import java.util.Scanner;

class Candidate {
    int id; String name; int aptitude, technical, communication;

    public Candidate(int id, String name, int apt, int tech, int comm) {
        this.id = id; this.name = name; this.aptitude = apt; this.technical = tech; this.communication = comm;
    }
    public int getTotalScore() { return aptitude + technical + communication; }
}

public class CampusPlacementQ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N (Total Candidates) and K (Top K to shortlist):");
        int N = sc.nextInt(); int K = sc.nextInt();
        Candidate[] candidates = new Candidate[N];

        System.out.println("Enter details (ID Name Apt Tech Comm):");
        for (int i = 0; i < N; i++) {
            candidates[i] = new Candidate(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
        }

        // Modern Java Smart Sort (Lambda Comparator)
        Arrays.sort(candidates, (c1, c2) -> {
            int score1 = c1.getTotalScore();
            int score2 = c2.getTotalScore();
            if (score1 != score2) return Integer.compare(score2, score1); // Descending by Score
            return Integer.compare(c1.id, c2.id); // Ascending by ID if scores are tied
        });

        System.out.println("\n--- TOP " + K + " SHORTLISTED CANDIDATES ---");
        for (int i = 0; i < K && i < N; i++) {
            System.out.println(candidates[i].id + " " + candidates[i].name + " " + candidates[i].getTotalScore());
        }
        sc.close();
    }
}