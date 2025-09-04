public class MyTemp5{
  public static void main(String[] args)
  {
    int op = 15;
    int ans = op++ + ++op - --op - op++;
    // ans = 15 ................. - 16
    // ans = 15 ................. - 16
    // Prefix R - L
    // ans = 15 .............- 16 - 16
    // ans = 15 + 17 - 16 - 16 ==> 0
    // op = 15 - 16 - 17 - 16 - 17 ==> 17
    System.out.println(ans);
    System.out.println(op);
  }
}