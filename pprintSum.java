import java.util.Scanner;
public class pprintSum{
public static void main(String args[])
{
    Scanner sc= new Scanner(System.in);
    int evenSum=0,oddSum=0;
    System.out.println("Enter the numbers and press 0 to stop");
    do{

        int n =sc.nextInt();
        if(n==0){
            break;
        }
        if(n%2==0){
            evenSum=evenSum+n;
        }
        else{
            oddSum=oddSum+ n;
        }

    }while(true);
    System.out.println("The sum of even integers are :" + evenSum);
System.out.println("The sum of odd integers are :" + oddSum);
}
}