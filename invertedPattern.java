import java.util.Scanner;
public class invertedPattern{
    public static void main(String args[]){
System.out.println("Entered the value till you want to print the pattern");
Scanner sc=new Scanner(System.in);
int n= sc.nextInt();
for(int i=0;i<n;i++){
    for(int j=n;j>i;j--){
        System.out.print("*");
    }
    System.out.println();
}

    }
}