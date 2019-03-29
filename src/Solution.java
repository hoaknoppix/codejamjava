import java.util.*;
import java.io.*;

public class Solution {

  public static void main(String args[]) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int n = Integer.parseInt(in.nextLine());
    for (int i = 1; i <= n; i++) {
      String line = in.nextLine();
      String items[] = line.split(" ");
      // manipulate the item here
      findSolution(i);
    }
  }

  public static void findSolution(int i) {
    // Find the solution for each case
    System.out.println("Case #" + i + ": IMPOSSIBLE");
  }
}
