import java.util.Scanner;
public class floydTriangle{
public static void floydtriangle(int n){
   int k=1;
    for(int i=1;i<=n;i++){
        for (int j=1;j<=i;j++){
            System.out.print(k + " ");
            k++;
        }
        System.out.println();
    }
}
public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of n");
    int n = sc.nextInt();
    floydtriangle(n);
}
}