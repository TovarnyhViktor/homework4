    import java.util.Scanner;
    public class ex4 {
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            System.out.print("Введите a: ");
            int a = in.nextInt();
            System.out.print("Введите b: ");
            int b = in.nextInt();
            System.out.print("Введите a float: ");
            float c = in.nextFloat();
            System.out.print("Введите b float: ");
            float d = in.nextFloat();
            int e = max(a,b);
            float f = max1(c,d);
            System.out.println(e);
            System.out.println(f);
        }
        public static int max(int a, int b) {
            int max;
            if (a < b)
                max = b;
            else
                max = a;

            return max;
        }
        public static float max1(float c, float d) {
            float max1;
            if (c < d)
                max1 = d;
            else
                max1 = c;

            return max1;
        }
    }
