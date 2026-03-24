import java.util.Scanner;

class Cricket {
    String playerName;
    String teamName;
    double battingAverage;
    Cricket(String playerName, String teamName, double battingAverage) {
        this.playerName = playerName;
        this.teamName = teamName;
        this.battingAverage = battingAverage;
    }
    void display() {
        System.out.println(playerName + " - " + battingAverage);
    }
}

public class add5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of players: ");
        int n = sc.nextInt();
        sc.nextLine();

        Cricket[] players = new Cricket[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of player " + (i + 1));

            System.out.print("Player Name: ");
            String name = sc.nextLine();

            System.out.print("Team Name: ");
            String team = sc.nextLine();

            System.out.print("Batting Average: ");
            double avg = sc.nextDouble();
            sc.nextLine();

            players[i] = new Cricket(name, team, avg);
        }
        System.out.println("\n--- Team-wise Player List ---");

        for (int i = 0; i < n; i++) {
            boolean printed = false;
            for (int j = 0; j < i; j++) {
                if (players[i].teamName.equals(players[j].teamName)) {
                    printed = true;
                    break;
                }
            }
            if (!printed) {
                System.out.println("\nTeam: " + players[i].teamName);

                for (int k = 0; k < n; k++) {
                    if (players[k].teamName.equals(players[i].teamName)) {
                        players[k].display();
                    }
                }
            }
        }

        sc.close();
    }
}
