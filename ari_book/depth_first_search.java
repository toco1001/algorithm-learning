import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

  static int N = 0;
  static int K = 0;
  static ArrayList<Integer> list = new ArrayList<Integer>();
  
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line = br.readLine();
    String line2 = br.readLine();
    String[] inputs = line2.split(" ");
    String line3 = br.readLine();

    N = Integer.parseInt(line);
    K = Integer.parseInt(line3);
    boolean isFinished = false;
    for (int i=0;i<N;i++){
      int A = Integer.parseInt(inputs[i]);
      if (A > K) { break; }
      if (A == K) {
        System.out.println("YES");
        isFinished = true;
        break;
      } else {
        list.add(A);
      }
    }

    if (!isFinished) {
      Collections.sort(list);
      if (dfs(0, 0)) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }
    }
  }

  public static boolean dfs(int i, int sum){
    if (i==N){ return (K==sum); }
    if (dfs(i+1, sum)) { return true; }
    if (dfs(i+1, sum+list.get(i))) { return true; }
    return false;
  }
}
