import java.util.Scanner;
public class sumOfDigits{
    public static int sumDigits(int a){
int sum=0,r;
while(a!=0){
    r=a%10;
    sum+=r;
    a=a/10;
}
return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        System.out.println("sum of digits of " + a + " is " +sumDigits(a));
          }
}