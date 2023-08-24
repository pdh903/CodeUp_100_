import java.util.Scanner;

public class codeUp_024 {
//단어를 1개 입력받는다.
//
//입력받은 단어(영어)의 각 문자를
//
//한줄에 한 문자씩 분리해 출력한다.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String st = sc.next();
        String[] sta = new String[st.length()];

        for (int i = 0; i < st.length(); i++) {
            sta[i] = st.substring(i,i+1);
            System.out.println("\'" + sta[i] + "\'");
        }
    }
}
