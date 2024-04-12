import java.util.Scanner; 
 public class leapyear { 
public static void main(String args[]) { 
Scanner sc = new Scanner(System.in);
int year = sc.nextInt();
// Boolean a = year%4 ==0;
// Boolean b = year%100 != 0;
// Boolean c = year%100 == 0 && year % 400 == 0;
// if( a && ( b || c ))
// {
//     System.out.println(" Year " + year + " is a leap year ");
// }
// else 
// System.out.println(" Year " + year + " is not a leap year ");
if(year%400 ==0)//order of conditions matters in this approach
{
    System.out.println("leap year ");
}
else if (year %100 == 0)
{
    System.out.println("not a leap year");
}
else if(year%4==0)
{
    System.out .println("leap year");
}
} 
}