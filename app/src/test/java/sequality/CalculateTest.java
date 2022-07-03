package sequality;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculateTest {
  @Test
  public void testSum() {
    Calculate calculate = new Calculate();
    int expected = 5;
    assertEquals(expected, calculate.sum(2, 3));
  }

  public void testAve() {
    Calculate calculate = new Calculate();
    double expecteds = 2.5;
    assertEquals(expecteds, Calculate.sumTo(2, 3));
  }

  public void testSumTo() {
    Calculate calculate = new Calculate();
    int expected = 55;
    asserEquals(expected, Calculate.sumTo(1, 10));
  }

  public void testSumOdd() {
    Calculate calculate = new Calculate();
    int expected = 25;
    assertEquals(expecteds, Calculate.sumOdd(1, 10));
  }

  public void testSumEven() {
    Calculate calculate = new Calculate();
    int expected = 30;
    assertEquals(expecteds, Calculate.sumEven(1, 10));
  }
}
