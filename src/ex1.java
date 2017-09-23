import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число до которого будет считать программа: ");
        int x = scanner.nextInt();
        function(x);
        }
    public static  void function(int x) {
        int l = 1;
        int[] chisla = new int[x];
        for (int j = 0; j < x; j++) {
            chisla[j] = l;
            l++;
        }
        for (int i = 0; i <= chisla.length; i++) {
            System.out.println(chisla[i]);
        }
    }
}
