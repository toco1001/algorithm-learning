import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        // Here your code !
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        String[] str_array = S.split("");
        int y_count = 0;
        int a_count = 0;
        int h_count = 0;
        int o_count = 0;
        boolean shouldPrintYES = true;
        for (String e: str_array){
            if (e.equals("o")){
                o_count += 1;
                if (o_count > 2) {
                    System.out.println("NO");
                    shouldPrintYES = false;
                    break;
                }
            } else if (e.equals("y")) {
                y_count += 1;
                if (y_count > 1) {
                    System.out.println("NO");
                    shouldPrintYES = false;
                    break;
                }
            } else if (e.equals("h")) {
                h_count += 1;
                if (h_count > 1) {
                    System.out.println("NO");
                    shouldPrintYES = false;
                    break;
                }
            } else if (e.equals("a")) {
                a_count += 1;
                if (a_count > 1) {
                    System.out.println("NO");
                    shouldPrintYES = false;
                    break;
                }
            } else {
                System.out.println("NO");
                shouldPrintYES = false;
                break;
            }
        }
        if (shouldPrintYES == true){
            System.out.println("YES");
        }
    }
}
