public class ex5 {
    public static void main(String[] args) {
        int x = 0;
        function(x);
    }
    //рекурсия вместо цикла
    public static void function(int x) {
        if (x <5) {
            x++;
            System.out.println(x);
            function(x);
            return;
        }
    }
}
