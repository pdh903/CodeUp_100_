import java.io.*;
import java.util.*;
public class codeUp_025 {
//다섯 자리의 정수 1개를 입력받아 각 자리별로 나누어 출력한다.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);

        int num = Integer.parseInt(st.nextToken());
        for (int i = 10000; i > 0; i /= 10) {
            int result = (num / i) * i;
            System.out.println("[" + result + "]");
            num = num % i;
        }
    }
}
