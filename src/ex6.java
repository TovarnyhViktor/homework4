    public class ex6 {
        static String drawRectangle(int width, int height, int i, int a,int r) {
            String result = "";
            if(r==1){
                r--;
                height--;
            }
            if(i < height || a<width){
                String line = "";
                if(a<width){
                    a++;
                    result= line+='+';
                }
                if(i<height && a==width){
                    i++;
                    result += "\n";
                    a=0;
                }
                result += drawRectangle(width,height,i,a,r);
            }
            return result;
        }

        public static void main(String[] args) {
            System.out.println(drawRectangle(4, 3,0,0,1));
        }
    }
