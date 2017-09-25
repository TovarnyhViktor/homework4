public class ex3 {
    static String drawRectangle(int width) {
        String result = "";
            for(int j = 0; j<width; j++) {
                for (int i = 0; i < width; i++) {
                    result+='+';
                }
                result += "\n";
            }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(drawRectangle(3));
    }
}
