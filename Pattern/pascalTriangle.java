import java.util.Scanner;
public class pascalTriangle{
    static int product(int n){
        if(n==0){
            return 1;
        } int mul=1;
        for (int i=1;i<=n;i++){
            mul=mul*i;
        }
        return mul;
    }
    static int bino(int i, int j){
        int a=product(i);
        int b=product(j);
        int c=product(i-j);
        int d = a/(b*c);
        return d;

    }
    static void pascal(int n ){
        for(int i=0;i<n;i++){
            for(int j=0;j<(n-i);j++){
                System.out.print(" ");
            }
            for(int j=0;j<i+1;j++){
                System.out.print(bino(i,j)+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n= sc.nextInt();
        pascal(n);
    }
}