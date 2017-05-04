import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
  static int N;
  static ArrayList<Integer> Alist = new ArrayList<Integer>();
  static int K;

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String input_n = br.readLine();
    String input_a = br.readLine();
    String input_k = br.readLine();
    N = Integer.parseInt(input_n);
    String[] str_array = input_a.split(" ");
    for (String e: str_array) {
      Alist.add(Integer.parseInt(e));
    }
    K = Integer.parseInt(input_k);
    System.out.println(depth_first_search(0, 0));
  }

  public static boolean depth_first_search(int i, int sum){
    if (i == N) { return sum == K; }
    if (depth_first_search(i+1, sum)) { return true; }
    if (depth_first_search(i+1, sum + Alist.get(i))) { return true; }
    return false;
  }
}
