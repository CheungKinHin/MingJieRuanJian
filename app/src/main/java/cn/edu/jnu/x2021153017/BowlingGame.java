package cn.edu.jnu.x2021153017;public class BowlingGame {
    int score = 0;
    public void roll(int pin) {
        score += pin;
    }

    public int score() {
        return score;
    }
}
