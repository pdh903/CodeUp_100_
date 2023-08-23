import java.io.*;
import java.util.StringTokenizer;

public class codeUp_010 {
//정수형(int)으로 변수를 선언하고, 변수에 정수값을 저장한 후
//변수에 저장되어 있는 값을 그대로 출력해보자

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);

        int a = Integer.parseInt(st.nextToken());
        System.out.println(a);
    }
}
