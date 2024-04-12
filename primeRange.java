 import java.util.Scanner;
 public class primeRange{

public static void isPrime(int n){
  int count=0;
  for(int i=2;i<=n;i++){
    for(int j=2;j<=Math.sqrt(i);j++){
    if(i==2){
        System.out.println(i);
    }
    else
    {
        if(i%j==0){
            count =1;
            break;
        }   
    } 
}
if (count==0){
          System.out.println(i);
          
        }
        count =0;
}
}
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the range till you want to check");
    int range = sc.nextInt();
    isPrime(range);
}
}