public class ex6 {
        static String drawRectangle(int width, int height,int i,int a) {
            String result = "";
            /*for(int i = 0; i < height; i++) {
                String line = "";
                for(int j = 0; j < width; j++) {
                    line += '+' ;
                }
                result += line + "\n";
            }*/
            if(i < height){
                i++;
                String line = "";
                if(a<width){
                    a++;
                    line+='+';
                }
                result += line + "\n";
                drawRectangle(width,height,i,a);
                return result;
            }
        }

        public static void main(String[] args) {
            System.out.println(drawRectangle(3, 2,0,0));
        }
    }
