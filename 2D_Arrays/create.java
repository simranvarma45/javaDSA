import java.util.Scanner;
public class create{
    public static boolean search(int arr[][],int key){
for(int i=0;i<arr.length;i++){
    for(int j=0;j<arr[0].length;j++){
        if (arr[i][j]==key){
            System.out.println("Element found at ("+ i + ","+ j+")");
            return true;
        }
    }
}
System.out.println("Element not found");
return false;
    }
    public static int searchsmallest(int arr[][]){
        int small= Integer.MAX_VALUE;
for(int i=0;i<arr.length;i++){
    
    for(int j=0;j<arr[0].length;j++){
        if (arr[i][j]<small){
            small=arr[i][j];
        }
    }
}
return small;
    }
    public static int searchlargest(int arr[][]){
        int large= Integer.MIN_VALUE;
for(int i=0;i<arr.length;i++){
    
    for(int j=0;j<arr[0].length;j++){
        if (arr[i][j]>large){
            large=arr[i][j];
        }
    }
}
    return large;
    }

    public static void main(String args[]){
Scanner sc= new Scanner(System.in);
int arr[][]=new int[3][4];
int m = arr.length;
int n = arr[1].length;
for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
        arr[i][j]=sc.nextInt();
    }
}
for(int i=0;i<m;i++){
    for(int j=0;j<n;j++){
      System.out.print (arr[i][j]+ " ");
    }
    System.out.println();
}
search(arr,6);
System.out.println("Smallest element is : "+ searchsmallest(arr));
System.out.println("largest element is : "+ searchlargest(arr));
    }
}