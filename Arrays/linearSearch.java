import java.util.Scanner;
public class linearSearch{
public static int search(int key,int array[])
{
for(int i=0;i<array.length;i++){
if(array[i]==key){
    return i;
}
}
return -1;
}

public static void main(String args[]){
int array[]={45,90,93,28,195,896,5,43,6,78,99};
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value of key ");
int key=sc.nextInt();
if(search(key,array)==-1){
    System.out.println("Invalid Input!!");
}
else
System.out.println("Element " + key + " is found at index: "+ search(key,array) );

}

}
