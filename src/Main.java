import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите a ");
        int a = sc.nextInt();
        System.out.println("Введите b ");
        int b = sc.nextInt();
        System.out.println("Введите c ");
        int c = sc.nextInt();
        calculation(a, b, c);
    }

    public static void calculation(int a, int b, int c){
        int d = b*b - 4 * a * c;
        switch(d){
            case 0:
                int x = (int)(-b/2*a);
                System.out.println("Дискриминант равен нулю, у уравнения один корень: " + x);
                break;
            default:
                if(d > 0){
                    int x1 = (int)(-b + Math.sqrt(d)) / 2*a;
                    int x2 = (int)(-b - Math.sqrt(d)) / 2*a;
                    System.out.println("Дискриминант больше нуля, в уравнении два корня: " + x1 + " и " + x2);
                }
                else{
                    System.out.println("Дискриминант отрицательный, у уравнения нет корней");
                }
                break;
        }
    }
}