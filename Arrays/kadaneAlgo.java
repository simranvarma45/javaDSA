public class kadaneAlgo{
public static void sum(int arr[]){
int cs=0,ms=Integer.MIN_VALUE;
int start=0,end=0,s=0;
int check=0;
//Special Case when all the values are negative
for(int j=0;j<arr.length;j++){
    if(arr[j]<=0){
        check=1;
    }
        else{
check=0;
break;
        } 
        
    
    }
    if(check==1){
                System.out.println("hii");
    for(int j=0;j<arr.length;j++){
    if(ms<arr[j]){
        ms=arr[j];
        start=j;
        end=j;

    }
    }
}

else{
for(int i=0;i<arr.length;i++){

cs=cs+arr[i];
if(cs<0){
    cs=0;
    s=i+1;
}
ms=Math.max(ms,cs);
if(ms==cs){
    start=s;
    end=i;
}
}
}
System.out.println("Max sum is : "+ ms);
System.out.println("Starting index is : "+ start);
System.out.println("End index is : "+ end);

}

public static void main(String args[]){
    int arr[]={-2,-10,-3,-4,0};
    sum(arr);
    int arr2[]={-4,6,9,-8,10,2,5,-4};
    sum(arr2);
}
}