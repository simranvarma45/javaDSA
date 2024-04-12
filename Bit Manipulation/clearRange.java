public class clearRange{
    public static int clear(int n, int i ,int j){
    int a= ((-1)<< (j+1));
    int b=((1<< i)-1);
int bitmask= a|b;
     return n & bitmask; 
    }
    public static void main(String args[]){
        int n =2515;
        System.out.println(clear(n,2,7));
    }
}