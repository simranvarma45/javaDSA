import java.util.Scanner;
public class characterPattern{
    public static void main(String args[]){
      Scanner sc =new Scanner(System.in);
      char ch ='A';
      for (int i=0;i<4;i++) {
        for(int j=0;j<=i;j++){
            // ch= (char) (ch + 1);
            // System.out.print(ch);
            System.out.print(ch);
            ch++;
        }
        System.out.println();
      } 
    }
}