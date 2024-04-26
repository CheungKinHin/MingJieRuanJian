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
    public void setUp()  {
        game = new BowlingGame();
    }
    private void repeatedRoll(int pin, int times) {
        for (int i = 0; i < times; i++) {
            game.roll(pin);
        }
    }
    private void rollASpare(){
        game.roll(3);
        game.roll(7);
    }
    private void rollAStrike() {
        game.roll(10);
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

    @Test
    public void test3() {       //2，0，1，9，16个0
        game.roll(2);
        game.roll(0);
        game.roll(1);
        game.roll(9);
        repeatedRoll(0,16);

        assertEquals(12,game.score());
    }
    @Test
    public void test4() {       //10，10，1，1，14个0

        rollAStrike();
        rollAStrike();
        repeatedRoll(1,2);
        repeatedRoll(0,14);

        assertEquals(35,game.score());
    }
    @Test
    public void test5() {       //12个10分
        repeatedRoll(10,12);

        assertEquals(300,game.score());
    }

}