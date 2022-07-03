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
    double expected = 2.5;
    assertEquals(expected, calculate.ave(2.0, 3.0), 0);
  }

  public void testSumTo() {
    Calculate calculate = new Calculate();
    int expected = 55;
    assertEquals(expected, calculate.sumTo(1, 10));
  }

  public void testSumOdd() {
    Calculate calculate = new Calculate();
    int expected = 25;
    assertEquals(expected, calculate.sumOdd(1, 10));
  }

  public void testSumEven() {
    Calculate calculate = new Calculate();
    int expected = 30;
    assertEquals(expected, calculate.sumEven(1, 10));
  }
}
