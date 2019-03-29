/*
Will be used, just in case
 */
public class Util {

  public static int pow(int a, int b) {
    int result = 1;
    for (int j = 1; j <= b; j++) {
      result = result * a;
    }
    return result;
  }

}
