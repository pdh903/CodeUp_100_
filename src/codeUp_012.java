import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class codeUp_012 {
//실수형(float)로 변수를 선언하고 그 변수에 실수값을 저장한 후
//저장되어 있는 실수값을 출력해보자.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        float num = Float.parseFloat(st.nextToken());

        System.out.println(String.format("%.6f", num));
    }
}
