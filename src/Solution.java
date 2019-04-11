import java.util.*;
import java.io.*;

public class Solution {

  public static void main(String args[]) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int t = Integer.parseInt(in.nextLine());
    for (int index = 1; index <= t; index++) {
      String line = in.nextLine();
      String items[] = line.split(" ");
      // manipulate the item here
      findSolution(index);
    }
  }

  public static void findSolution(int index) {
    // Find the solution for each case
    System.out.println("Case #" + index + ": IMPOSSIBLE");
  }
}
