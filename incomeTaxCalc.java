import java.util.Scanner;

public class incomeTaxCalc {

  public static void main(String args[]) {

Scanner sc= new Scanner(System.in);
int sal= sc.nextInt();
int tax;
if (sal<=500000){
    tax=0;
}
else if (sal>500000&& sal<=1000000){
tax=(int)((sal-500000)* 0.2) ;

}
else {
tax=(int) (((sal- 1000000) * 0.4)+ (500000 * 0.2));

}
System.out.println("Your salary is : " + sal + " and the amount of tax you have to pay is : " + tax);
  }
}
