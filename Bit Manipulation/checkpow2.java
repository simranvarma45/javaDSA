public class checkpow2{
    public static boolean check(int n){
        int m = n -1 ;
        // if((n&m)==0){
        //     return true;
        // }
        // else { return false;}
        return (( n & (n-1))==0);
    }
    public static void main(String args[]){
        int n =8;
        System.out.println(check(n));
    }
}