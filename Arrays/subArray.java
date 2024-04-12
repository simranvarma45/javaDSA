public class subArray{
public static void sub(int arr[]){
int ts=0;
int sum=0,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
for(int i=0;i<arr.length;i++){
for(int j=i;j<arr.length;j++){
    for(int k=i;k<=j;k++){
        System.out.print(arr[k]+ " ");
        sum+=arr[k];
        
    }
    ts++;
    System.out.println();
    System.out.println("sum is :" + sum);
    if(sum<min){
       min=sum; 
    }
    if(sum>max){
        max=sum;
    }
    sum=0;
    
}
System.out.println();
}
System.out.println("total number of subarrays are : "+ ts);
System.out.println("Maximum sum is : "+ max);
System.out.println("Minimum sum is : "+ min);
}

public static void main(String args[]){
    int arr[]={23,45,2,11,37,89,5};
    sub(arr);
}

}