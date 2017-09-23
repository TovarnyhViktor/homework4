public class ex2 {
        static String drawRectangle(int width, int height, char c) {
            String result = "";
            for(int i = 0; i < height; i++) {
                String line = "";
                for(int j = 0; j < width; j++) {
                    line += c;
                }
                result += line + "\n";
            }
            return result;
        }
        public static void main(String[] args) {
            System.out.println(drawRectangle(3, 2, '+'));
        }
}

