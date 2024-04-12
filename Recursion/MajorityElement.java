// Brute Force Approach-------
// public class MajorityElement{
//     public static int majority(int arr[],int n){
//         int majorityElement=n/2;
//         for(int i=0;i<n;i++){
//             int count =0;
//             for(int j=0;j<n;j++){
//                 if(arr[i]==arr[j]){
//                     count ++;
//                 }
            
//             }
//             if(count >=majorityElement){
//                 return arr[i];
//             }
//         }
//         return -1;
//     }
//     public static void main(String args[]){
//         int arr[]={1,3,3,2,1,2,3,4,5,5,4,3,3,3,3};
//         int a=majority(arr,arr.length);
//         System.out.println(a);
//     }
// }

// Using Divide and Conquer or Recursion---
public class MajorityElement{
private static int countInRange(int nums[],int num,int lo,int hi){
    int count =0;
    for(int t=lo;t<=hi;t++){
        if(nums[t]==num){
            count++;
        }
    }
    return count;
}
private static int majorityElementRec(int nums[],int lo,int hi){
    if(lo==hi){
        return nums[lo];
    }
    int mid = (hi -lo)/2 + lo;
    int left = majorityElementRec(nums,lo,mid);
    int right = majorityElementRec(nums,mid+1,hi);
    if(left==right){
        return left;
    }
    int leftCount = countInRange(nums,left,lo,hi);
    int rightCount= countInRange(nums,right,lo,hi);
    return leftCount>rightCount ? left : right;
}
public static int majorityElement(int nums[]){
    return majorityElementRec(nums,0,nums.length-1);
}
public static void main(String args[]){
    int nums[]={2,1,3,4,5,2};
    int a= majorityElement(nums);
    System.out.println("Majority Element is : " + a);
}
}