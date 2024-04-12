
public class pivotIndex{
public static int rotate(int arr[],int target){
int start=0,end=arr.length - 1;
while(start<=end){
    int mid =(start+ end )/2;
    {
if(arr[mid]==target){
    return mid;
}
else{
if(mid>target){
    
    end=mid-1;
}
else {
  start=mid+1;  
}

}
    }
}
return -1;
}
public static void main(String args[]){
    int arr[]={2,4,5,6,7,8,9,11,13,54};
    System.out.println(rotate(arr,211));
}
}