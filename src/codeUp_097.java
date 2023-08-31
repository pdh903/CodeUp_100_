import java.util.Scanner;

public class codeUp_097 {
//    바둑알이 깔려 있는 상황이 19 * 19 크기의 정수값으로 입력된다.
//십자 뒤집기 횟수(n)가 입력된다.
//십자 뒤집기 좌표가 횟수(n) 만큼 입력된다. 단, n은 10이하의 자연수이다.
//    십자 뒤집기 결과를 출력한다.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] array = new int[19][19];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int y = sc.nextInt();
            int x = sc.nextInt();
            for (int j = 0; j < array.length; j++) {
                if (array[y-1][j] == 0) {
                    array[y-1][j] = 1;
                }
                else array[y-1][j] = 0;
            }
            for (int j = 0; j < array.length; j++) {
                if (array[j][x-1] == 0) {
                    array[j][x-1] = 1;
                }else array[j][x-1] = 0;
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
