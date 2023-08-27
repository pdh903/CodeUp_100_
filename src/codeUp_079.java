import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class codeUp_079 {
//    'q'가 입력될 때까지 입력한 문자를 계속 출력하는 프로그램을 작성해보자.

    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//
//        while (true) {
//            char data = sc.next().charAt(0);
//
//            System.out.println(data);
//            if (data == 'q')
//                break;
//        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        String[] array = str.split(" ");

        for (String s : array) {
            System.out.println(s);
            if (s.charAt(0) == 'q') {
                break;
            }
        }
    }
}
