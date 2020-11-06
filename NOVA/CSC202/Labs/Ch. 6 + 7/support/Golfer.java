//----------------------------------------------------------------------
// Golfer.java            by Dale/Joyce/Weems                  Chapter 6
//
// Supports golfer objects having a name and a score.
// Allows golfers to be compared based on their scores.
//----------------------------------------------------------------------
package support;

import java.io.Serializable;

public class Golfer implements Comparable<Golfer>, Serializable {

    protected String name;
    protected int score;

    public Golfer(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public int compareTo(Golfer other) {
        if (this.score < other.score) {
            return -1;
        } else if (this.score == other.score) {
            return 0;
        } else {
            return +1;
        }
    }

    @Override
    public String toString() {
        return (score + ": " + name);
    }
}
