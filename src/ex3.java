public class ex3 {
    static String drawRectangle(int width) {
        String result = "";
        for (int i = 0; i < width; i++) {
            String line = "";
            for (int j = 0; j < width; j++) {
                line += '+' ;
            }
            result += line + "\n";
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(drawRectangle(3));
    }
}
