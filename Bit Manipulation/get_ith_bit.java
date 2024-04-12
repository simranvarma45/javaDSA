import java.util.Scanner;
public class get_ith_bit{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Entered the value and thr position");
        int n = sc.nextInt();
        int i = sc.nextInt();
        if((n & (1<< i) )== 0){
            System.out.println(i+ "th bit is : " + 0);
        }
        else {
            System.out.println(i+ "th bit is :  " + 1);
        }
    }
}