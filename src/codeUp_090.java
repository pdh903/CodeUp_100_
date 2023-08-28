import java.util.Scanner;

public class codeUp_090 {
//시작 값(a), 등비의 값(r), 몇 번째 인지를 나타내는 정수(n)가
//공백을 두고 입력된다.(모두 0 ~ 10)
//n번째 수를 출력한다

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int r = sc.nextInt();
        int n = sc.nextInt();

        long result = a;

        for (int i = 1; i < n; i++) {
            result = result * r;
        }
        System.out.println(result);
    }
}
