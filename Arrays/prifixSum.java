public class prifixSum{
public static void sum(int arr[]){
int sum=0,max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;;
int prifix[]=new int[arr.length];
prifix[0]=arr[0];
for(int i=1;i<prifix.length;i++){
// sum+=arr[i];
// prifix[i]=sum;
prifix[i]=prifix[i-1]+arr[i];
}

for(int i=0;i<arr.length;i++){
    int start=i;
    for(int j=i;j<arr.length;j++){
        int end=j;
        
      sum+= (start==0)?prifix[end]: prifix[end]-prifix[start-1];
      if(sum<min){
       min=sum; 
    }
    if(sum>max){
        max=sum;
    }
    System.out.println(sum);
    sum=0;
    }
    
    
}
System.out.println("Maximum sum is : "+ max);
System.out.println("Minimum sum is : "+ min);

}

public static void main(String args[]){
    int arr[]={1,-2,6,-1,3};
    sum(arr);
}

}