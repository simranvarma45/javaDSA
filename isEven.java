import java.util.Scanner;
public class isEven{
public static boolean iseven(int a){
    if(a%2==0){
        return true;
    }
    return false;
}
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a =sc.nextInt();
if(iseven(a)){
    System.out.println( a + " is even");
}
else 
System.out.println( a + " is odd");
}

}