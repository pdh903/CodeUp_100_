import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class codeUp_011 {
//문자형(char)으로 변수를 하나 선언하고, 변수에 문자를 저장한 후
//변수에 저장되어 있는 문자를 그대로 출력해보자.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        System.out.println(str);
    }
}
