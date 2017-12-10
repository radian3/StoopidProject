package george.lost.to.a.bot.StoopidProject;

import org.junit.Assert;
import org.junit.Test;

/*
 * Tests the <code>MathUtils</code> class.
 */
public class addNumsTest {

  @Test
  public void testAddNumsSuccess() {
    int num1 = 2;
    int num2 = 3;
    int expected = 5;
    int actual = MathUtils.addNums(num1, num2);
    Assert.assertEquals(actual, expected);
  }
}
