import java.util.Scanner;

public class codeUp_082 {
//A, B, C, D, E, F 중 하나가 입력될 때,
//1부터 F까지 곱한 16진수 구구단의 내용을 출력해보자.
//(단, A ~ F 까지만 입력된다.)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();


        for (int i = 1; i < 16; i++) {

            System.out.print(str.toUpperCase() + "*" + Integer.toHexString(i).toUpperCase());
            System.out.println("=" + Integer.toHexString(Integer.parseInt(str,16)*i).toUpperCase());
        }

    }
}
