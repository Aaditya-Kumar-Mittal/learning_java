public class SumMethodClass {

  // accessType returnType methodName(parameters) {}

  public int sum(int num1, int num2) {
    return num1 + num2;
  }

  public float sum(float f1, float f2) {
    return f1 + f2;
  }

  public double sum(double d1, double d2) {
    return d1 + d2;
  }

  public int sum(int... args) {

    // Using variable args.
    
    int sum = 0;
    for (int i = 0; i < args.length; i++) {
      sum += args[i];
    }
    return sum;
  }
}
