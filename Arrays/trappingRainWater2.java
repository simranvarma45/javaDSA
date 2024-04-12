public class trappingRainWater2{
    public static int trap(int arr[]){
        int l=0,r=arr.length-1,leftmax=arr[l],rightmax=arr[r];
        int res=0;
        while(l<r){
            if(leftmax<rightmax){
                l++;
                leftmax=Math.max(leftmax,arr[l]);
                res+= leftmax-arr[l];
            }
            else{
                  r--;
                  rightmax=Math.max(rightmax,arr[r]);
                  res+= rightmax-arr[r];

            }
        }
        return res;
    }
    public static void main(String args[]){
        int arr[]={4,2,0,3,2,5};
        System.out.println("Total trapped water is : "+ trap(arr));
    }
}