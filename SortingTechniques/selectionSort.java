public class selectionSort{
    public static void selection(int arr[]){

for(int i=0;i<arr.length -1 ;i++){
    int min= i;
    for(int j=i+1;j<=arr.length - 1; j++){
if(arr[j]<arr[min]){//if(arr[j]>arr[min]
    min=j;
    
    
}
    }
     
int temp=arr[i];
arr[i]=arr[min];
arr[min]=temp;
}

    }

public static void print(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+ " ");
    }
}
public static void main(String args[]){
    int arr[]={2,43,11,23,56,78,54,66};
    selection(arr);
    print(arr);
}
}
//best case time complexity - O(n^2)--when array is already sorted
//worst case time complexity - O(n^2)