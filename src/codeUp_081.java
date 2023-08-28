import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class codeUp_081 {
//1부터 n까지, 1부터 m까지 숫자가 적힌
//서로 다른 주사위 2개를 던졌을 때 나올 수 있는 모든 경우를 출력해보자.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                System.out.println(i + " " + j);
            }
        }
    }
}
