import java.util.Scanner;
public class clearbit{
    public static int clear(int n , int i){
int bitmask= (~(1<<i));
return ( n & (bitmask));

    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int i= sc.nextInt();
        System.out.println(clear(n,i));
    }
}