//Using recursive approach
// public class RotatedArray{

// public static int findIndex(int arr[],int si, int ei, int target){
//     if(si>ei){
//         return -1;
//     }
//     int mid =si+(ei-si)/2;
//     if(arr[mid]==target){
//         return mid;
//     }
// if(arr[si]<=arr[mid]){//mid on line 1
// //left
// if(arr[si]<= target && target <= arr[mid]){
//     return findIndex(arr,si,mid-1,target);
// }
// else{//right
//     return findIndex(arr,mid+1,ei,target);
// }
// }
// else {//mid on line 2
// //right
// if(arr[mid]<=target && target <=arr[ei]){
//     return findIndex(arr,mid+1,ei,target);
// }
// else{//left
// return findIndex(arr,si,mid-1,target);
// }
// }
// }
// public static void main(String args[]){
//     int arr[]={4,5,6,7,0,1,2};
//     System.out.println(findIndex(arr,0,arr.length-1,0));
// }
// }
//using iterative approach
public class RotatedArray{
    public static int search(int arr[],int si,int ei,int target){
        
        while(si<=ei){
int mid = si+(ei-si)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[si]<=arr[mid]){
            if(arr[si]<=target && target <= arr[mid]){
                ei=mid-1;
            }
            else {
                si=mid+1;
            }
        }
        else{
            if(arr[mid]<=target && target <=arr[ei]){
                si=mid+1;
            }
            else{
                ei=mid-1;
            }
        }
        }
        return -1;
    }
    public static void main(String args[]){
        int arr[]={4,5,6,7,0,1,2};
        System.out.println(search(arr,0,arr.length-1,0));
    }
}