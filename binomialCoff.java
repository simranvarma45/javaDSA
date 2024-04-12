 import java.util.Scanner;
 public class binomialCoff{ 
   public static double binoCoff(int n, int r){
int n_fact=fact(n);
int r_fact=fact(r);
int n_r_fact=fact((n-r));
double x =(n_fact)/(r_fact * n_r_fact);
return x;
   } 
   public static int fact(int s){
    int z=1;
    for(int i =1;i<=s;i++){
z=z*i;
    }
    return z;
   }
public static void main(String args[]) { 
Scanner sc = new Scanner(System.in);
int n=sc.nextInt();
int r= sc.nextInt();
 double result= binoCoff(n,r);
System.out.println("The binomial coefficient is : " + result);
} 
}