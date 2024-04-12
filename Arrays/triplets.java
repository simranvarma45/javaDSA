public class triplets{

public static void print(int arr[]){
for(int i=0;i<arr.length;i++){
    for(int j=0;j<arr.length;j++){
       for(int k=0;k<arr.length;k++){
        if((arr[i] + arr[j] + arr[k] )==0){
            if(fact(i)==j && fact(j)==k && fact(i)==k){
                System.out.print(arr[i] + " ");
                System.out.print(arr[j] + " ");
                System.out.print(arr[k] + " ");
            }
        }
       }
       
    }
}

}
public static int fact(int num){
    int mul=1;
if(num==0){
    return 1;
}
else{ 
    for(int i=1;i<=num;i++){
        mul=mul*i;
    }
    return mul;
}

}
public static void main(String args[]){
    int arr[]={-1,0,1,2,-1,-4};
}
}