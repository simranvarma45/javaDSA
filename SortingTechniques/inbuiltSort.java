import java.util.Arrays;
import java.util.Collections;
public class inbuiltSort{
    public static void print(Integer arr[]){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
Integer arr[]={34,22,43,12,51,6,56,3};
Arrays.sort(arr);
print(arr);
Integer arr1[]={23,1,25,4,67,5,88};
Arrays.sort(arr1,1,4);
print(arr1);
Arrays.sort(arr,Collections.reverseOrder());
print(arr);
Integer arr2[]={223,13,225,45,667,75,888};
Arrays.sort(arr2,0,4);
print(arr2);
Arrays.sort(arr,1,4,Collections.reverseOrder());
print(arr);
    }
}