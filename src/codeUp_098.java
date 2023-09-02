import java.util.Scanner;

public class codeUp_098 {
//    첫 줄에 격자판의 세로(h), 가로(w) 가 공백을 두고 입력되고,
//두 번째 줄에 놓을 수 있는 막대의 개수(n)
//세 번째 줄부터 각 막대의 길이(l), 방향(d), 좌표(x, y)가 입력된다.
//
//입력값의 정의역은 다음과 같다.
//
//1 <= w, h <= 100
//1 <= n <= 10
//d = 0 or 1
//1 <= x <= 100-h
//1 <= y <= 100-w
//    모든 막대를 놓은 격자판의 상태를 출력한다.
//막대에 의해 가려진 경우 1, 아닌 경우 0으로 출력한다.
//단, 각 숫자는 공백으로 구분하여 출력한다.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();

        int[][] array = new int[h][w];

        int n = sc.nextInt();


        for (int i = 0; i < n; i++) {
            int l = sc.nextInt();
            int d = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            for (int j = 0; j < l; j++) {
                array[x-1][y-1] = 1;
                if (d == 1) {
                    x++;
                } else {
                    y++;
                }
            }
        }

        for (int[] ints :
                array) {
            for (int i = 0; i < ints.length; i++) {
                System.out.print(ints[i] + " ");
            }
            System.out.println();
        }


    }
}
