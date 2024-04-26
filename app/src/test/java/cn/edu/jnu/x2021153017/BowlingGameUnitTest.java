package cn.edu.jnu.x2021153017;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class BowlingGameUnitTest {

    private BowlingGame game;

    @Before
    public void setUp() throws Exception {
        game = new BowlingGame();
    }
    private void repeatedRoll(int pin, int times) {
        for (int i = 0; i < times; i++) {
            game.roll(pin);
        }
    }
    @Test
    public void test1() {       //20zeros

        repeatedRoll(0, 20);

        assertEquals(0, game.score());
    }
    @Test
    public void test2() {       //20个1

        repeatedRoll(1,20);

        assertEquals(20,game.score());
    }


}