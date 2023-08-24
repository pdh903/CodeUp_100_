import java.util.Scanner;

public class codeUp_023 {
//실수 1개를 입력받아 정수 부분과 실수 부분으로 나누어 출력한다.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String st = sc.next();
        System.out.println(st.substring(0, st.indexOf(".")));
        System.out.println(st.substring(st.indexOf(".")+1));
    }
}
