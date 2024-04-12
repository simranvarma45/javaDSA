import java.util.*;

public class exercise1{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
// int a=sc.nextInt();
// int b= sc.nextInt();
// int c=sc.nextInt();
// float avg= (a+b+c)/3;
// System.out.println(avg);
float pen=sc.nextFloat();
float pencil=sc.nextFloat();
float eraser = sc.nextFloat();
float cost=pen+pencil+eraser;
double costg=cost+(cost*0.18);
System.out.println(cost);
System.out.println(costg);

}

}