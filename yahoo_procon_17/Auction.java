import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String[] inputs = line.split(" ");
        int N = Integer.parseInt(inputs[0]);
        int K = Integer.parseInt(inputs[1]);

        String line2 = br.readLine();
        String[] inputs2 = line2.split(" ");
        ArrayList<Integer> i_array = new ArrayList<Integer>();
        for (int i=0;i<N;i++){
            int A = Integer.parseInt(inputs2[i]);
            i_array.add(A);
        }
        Collections.sort(i_array);
        long sum = 0;
        for (int k=0;k<K;k++){
            sum += i_array.get(k);
            sum += k;
        }
        System.out.println(sum);
    }
}
