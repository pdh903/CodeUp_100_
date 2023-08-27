import java.util.Scanner;

public class codeUp_027 {
//년월일을 출력하는 방법은 나라마다, 형식마다 조금씩 다르다.
//
//년월일(yyyy.mm.dd)를 입력받아,
//
//일월년(dd-mm-yyyy)로 출력해보자.
//
//(단, 한 자리 일/월은 0을 붙여 두자리로, 년도도 0을 붙여 네자리로 출력한다.)

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String date = sc.next();

        int y, m, d;
        y = Integer.parseInt(date.substring(0, 4));
        m = Integer.parseInt(date.substring(5, 7));
        d = Integer.parseInt(date.substring(8));

        System.out.println(String.format("%02d", d) + "-" + String.format("%02d", m) + "-" + String.format("%04d", y));
    }
}
