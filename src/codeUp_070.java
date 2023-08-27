import java.util.Scanner;

public class codeUp_070 {
//    월이 입력될 때 계절 이름이 출력되도록 해보자.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int season = sc.nextInt();

        switch (season) {
            case 12 :
            case 1 :
            case 2 :
                System.out.println("Winter");
                break;
            case 3 :
            case 4 :
            case 5 :
                System.out.println("Spring");
                break;
            case 6 :
            case 7 :
            case 8 :
                System.out.println("Summer");
                break;
            case 9 :
            case 10 :
            case 11:
                System.out.println("fall");
                break;
        }
    }
}
