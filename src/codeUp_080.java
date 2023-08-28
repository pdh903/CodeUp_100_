import java.util.Scanner;

public class codeUp_080 {
//1, 2, 3 ... 을 계속 더해 나갈 때,
//그 합이 입력한 정수(0 ~ 1000)보다 같거나 작을 때까지
//계속 더하는 프로그램을 작성해보자.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int result = 0;
        int i = 0;
        while (result < num) {
            i++;
            result += i;
        }
        System.out.println(i);


    }
}
