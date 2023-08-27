import java.util.Scanner;

public class codeUp_033 {
//    10진수를 입력받아 16진수 대문자(hexadecimal)로 출력해보자.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String hex = Integer.toHexString(num);
        String Hex = hex.toUpperCase();
        System.out.println(Hex);
    }
}
