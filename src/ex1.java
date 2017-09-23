public class ex1 {
    public static void main(String[] args) {
        int x = 5;
        int l=0;
        function(x,l);
        }

        //Решение задачи с помощью массива :ь
    /*public static  void function(int x) {
        int l = 1;
        int[] chisla = new int[x];
        for (int j = 0; j < x; j++) {
            chisla[j] = l;
            l++;
        }
        for (int i = 0; i <= chisla.length; i++) {
            System.out.println(chisla[i]);
        }
    }*/

    //Решение цыклом
    public static void  function(int x,int l){
        for(int i=0; i<x;i++){
            l++;
            System.out.println(l);
        }
    }
}