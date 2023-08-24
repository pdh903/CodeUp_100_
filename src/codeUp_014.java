import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class codeUp_014 {
//    2개의 문자(ASCII CODE)를 입력받아서 순서를 바꿔 출력해보자

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        String a = st.nextToken();
        String b = st.nextToken();
        System.out.println(b);
        System.out.println(a);

    }
}
