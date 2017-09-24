import java.util.Scanner;
public class ex4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Введите a: ");
        int a = in.nextInt();
        System.out.print("Введите b: ");
        int b = in.nextInt();
        int c = maxfunctionint(a,b);
        int d = maxfunctionfloat(a,b);
        System.out.println(c);
        System.out.println(d);
    }
    public static int maxfunctionint(int a, int b) {
        int max1;
        if (a < b)
            max1 = b;
        else
            max1 = a;

        return max1;
    }
    public static int maxfunctionfloat(float a, float b) {
        int max;
        if (a < b)
            max = b;
        else
            max = a;

        return max;
    }
}
