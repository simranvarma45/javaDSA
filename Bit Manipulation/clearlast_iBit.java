public class clearlast_iBit{
    public static int clear(int n , int i){
        // int bitmask= (~0)<< i;
        int a = (-1)<< (j+1);
        int b = (1<<i) - 1;
        int bitmask = a|b;
        return n & bitmask;
    }
    public static void main(String args[]){
        System.out.println(clear(15,2));
    }
}