import java.util.Scanner;

public class codeUp_096 {
//    바둑판에 올려 놓을 흰 돌의 개수(n)가 첫 줄에 입력된다.
//둘째 줄 부터 n+1 번째 줄까지 힌 돌을 놓을 좌표(x, y)가 n줄 입력된다.
//n은 10이하의 자연수이고 x, y 좌표는 1 ~ 19 까지이며, 같은 좌표는 입력되지 않는다.
//흰 돌이 올려진 바둑판의 상황을 출력한다.
//흰 돌이 있는 위치는 1, 없는 곳은 0으로 출력한다.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array = new int[19][19];

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int y = sc.nextInt();
            int x = sc.nextInt();
            array[y-1][x-1] = 1;
        }

        for (int[] ints : array) {
            for (int j = 0; j < ints.length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}
