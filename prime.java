 import java.util.Scanner;
 public class prime{ 
public static void main(String args[]) { 
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
boolean check=true;
if(n<2)
{
    System.out.println("not prime");
}
else{
  if(n==2){
            System.out.println("prime number");
          }
  else{
// for(int i=2;n>=i*i;i++)
            for(int i=2; i<= Math.sqrt(n);i++)
{
if (n%i==0){
    check=false;
    break;
}
}
}
if(check){
    System.out.println("prime number");
}
else 
System.out.println("not prime");
}
} 
}