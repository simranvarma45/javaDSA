import java.util.Scanner;
public class evenOdd{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int a= sc.nextInt();
        if((a & 1) != 0){
            System.out.println("Entered number is an odd number");
        }
        else {
            System.out.println("Entered number is an even number");
        }

    }
}