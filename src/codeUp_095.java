import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class codeUp_095 {
//    번호를 부른 횟수(n, 1 ~ 10000)가 첫 줄에 입력된다.
//n개의 랜덤 번호(k, 1 ~ 23)가 두 번째 줄에 공백을 사이에 두고 순서대로 입력된다.
//    출석을 부른 번호 중에 가장 빠른 번호를 1개만 출력한다.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        String[] array;
        array = str.split(" ");

        int min = Integer.parseInt(array[0]);

        for (int i = 1; i < array.length; i++) {
            if (min > Integer.parseInt(array[i])) {
                min = Integer.parseInt(array[i]);
            }
        }
        System.out.println(min);

    }
}
