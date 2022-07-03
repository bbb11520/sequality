package sequality;

public class Calculate {
  public double ave(double x, double y) {

    return x / y;
  }

  public int sum(int x, int y) {
    return x + y;
  }

  public int sumTo(int x, int y) {
    int sum = 0;
    int i;
    for (i = x; i <= y; i++) {
      sum += i;
    }
    return sum;
  }

  public int sumOdd(int x, int y) {
    int i, odd = 0;
    for (i = x; i <= y; i++) {
      if (i % 2 == 1) {
        odd += i;
      }
    }
    return odd;
  }

  public int sumEven(int x, int y) {
    int i, even = 0;
    for (i = x; i <= y; i++) {
      if (i % 2 == 0) {
        even += i;
      }
    }
    return even;
  }
}
