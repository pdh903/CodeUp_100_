import java.util.Scanner;

public class codeUp_031 {
//    10진수를 입력받아 8진수(octal)로 출력해보자.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String oc = Integer.toOctalString(num);
        System.out.println(oc);
    }
}
