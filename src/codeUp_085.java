import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class codeUp_085 {
//    h, b, c, s 가 공백을 두고 입력된다.
//h는 48,000이하, b는 32이하(단, 8의배수), c는 5이하, s는 6,000이하의 자연수이다.
//    필요한 저장 공간을 MB 단위로 바꾸어 출력한다.
//단, 소수점 둘째 자리에서 반올림해 첫째 자리까지 출력하고 MB를 공백을 두고 출력한다.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);

        long h = Integer.parseInt(st.nextToken());
        long b = Integer.parseInt(st.nextToken());
        long c = Integer.parseInt(st.nextToken());
        long s = Integer.parseInt(st.nextToken());

        double result = h * b * c * s;
        result = result / 8 / 1024 / 1024;

        System.out.println(String.format("%.1f", result) + " MB");

    }
}
