import java.util.Scanner;
public class Decimal2Binary{
  public static double  DeciBin(double n){
    double x=0;
    double y=0;
    int s,t;
    while(n!=0){
       s=(int)(n%2);
x=x*10+s;
n=n/2;
    }
while(x!=0){
  t=(int)(x%10);
  y=y*10+t;
  x=x/10;  
}
return y;
  }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the decimal value");
    double a=sc.nextDouble();
    double x=DeciBin(a);
    System.out.println("The binary equivalent of "+ a + " is "+ x);
  }
}