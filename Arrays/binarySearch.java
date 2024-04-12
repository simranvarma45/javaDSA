import java.util.Scanner;
public class binarySearch{
public static int search(int array[],int element){
int min=0;
int max=array.length - 1;
int mid;
while(min<=max){
   mid=(min+max)/2; 
   if(array[mid]==element){
    return mid;
   }else {
   if(array[mid]<element){
    // min=mid+1;
    max=mid-1;
   }
   else 
//    max=mid-1;
min=mid+1;
}
}
return -1;
}
public static void main(String args[]){
// int array[]={2,4,5,7,89,763,876};//ascending sorted array
int array2[]={56,45,34,22,11,3,2,1,-5,-9};//descending sorted array
Scanner sc= new Scanner (System.in);
System.out.println("Enter the element");
int element=sc.nextInt();
if(search(array2,element)==-1){
    System.out.println("Element " + element + " is not found ");
}
else 
System.out.println("Element "+ element + " is found at index "+ search(array2,element));

}

}