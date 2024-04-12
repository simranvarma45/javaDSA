import java.util.Scanner;
public class Binary2Decimal{
public static double BinaryDecimal(double n){
    int r=0,s=0;
    double num =0;
while(n!=0){
r=(int)(n%10);
num=num+ (r* Math.pow(2,s));
s++;
n=n/10;
}
return num;
}

public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the binary number");
double n= sc.nextDouble();
double x=BinaryDecimal(n);
System.out.println("The decimal equivalent of "+ n +" is "+ x);
}
}
