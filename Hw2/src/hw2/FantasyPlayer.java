package hw2;

import java.util.Comparator;

public class FantasyPlayer implements Comparable<FantasyPlayer> {
    public String name; // player name
    public String teamName; // player team name
    public String position; // Position the player plays
    public int age; // Player's age
    public int gamesPlayed; // How many games the player played

    public int atBats; // Number of at-bats for the player

    public int runsScored; // How many runs scored by the player

    public int singles; // How many singles hit by the player
    public int doubles; // How many doubles hit by the player
    public int triples; // How many triples hit by the player
    public int homeruns; // How many homeruns hit by the player

    public int rbis; // How many times a player's teammate scored as a result of a player's at-bat

    public FantasyPlayer(String name, String teamName, String position, int age, int gamesPlayed,
                         int atBats, int runsScored, int singles, int doubles, int triples,
                         int homeruns, int rbis) {
        this.name = name;
        this.teamName = teamName;
        this.position = position;
        this.age = age;
        this.gamesPlayed = gamesPlayed;
        this.atBats = atBats;
        this.runsScored = runsScored;
        this.singles = singles;
        this.doubles = doubles;
        this.triples = triples;
        this.homeruns = homeruns;
        this.rbis = rbis;
    }

    // Question 3
    public static class AverageComparator implements Comparator<FantasyPlayer> {
        public int compare(FantasyPlayer p1, FantasyPlayer p2) {
            // TODO
            return -1;
        }
    }
    public double getSluggingPct() {
        // TODO
        return -1;
    }

    public double getBattingAverage() {
        // TODO
        return -1;
    }

    // Question 1
    public int compareTo(FantasyPlayer other) {
        // TODO
        return -1;
    }

    public String toString() {
        return name;
    }
}
