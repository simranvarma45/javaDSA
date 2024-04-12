public class TrappingRainWater{
    public static void trap(int arr[]){
int width=1,ts=0,sum=0,check1=0,check2=0;
int maxleft[]=new int[arr.length];
int maxright[]=new int[arr.length];
for(int i=0;i<arr.length -1;i++){
    if(arr[i]<arr[i+1]){
        check1=1;
    }
    else 
    {
        check1=0;
        break;

    }
    
}
for(int i=0;i<arr.length-1;i++){
    if(arr[i]>arr[i+1]){
        check2 = 1;
    }
    else{
        check2=0;
        break;
    }
 }
if(check1==1||check2==1 || arr.length<3){
    System.out.println("No water trapped");
}
else{
maxleft[0]=arr[0];
maxright[arr.length -1]=arr[arr.length - 1];
for(int i=1;i<arr.length;i++){
if(maxleft[i-1]>arr[i]){
    maxleft[i]=maxleft[i-1];
}
else 
maxleft[i]=arr[i];
}
for(int i=arr.length - 2; i>=0;i--){
    if(maxright[i+1]>arr[i]){
        maxright[i]=maxright[i+1];
    }
    else {
        maxright[i]=arr[i];
    }
}
for(int i=0;i<arr.length;i++){
sum=(Math.min(maxright[i],maxleft[i]) - arr[i])*width;
System.out.println("Water trapped by "+ arr[i]+  " is "+ sum);
ts+=sum;
sum=0;
}
System.out.println("Total water trapped is : "+ ts);
    }
    }
    public static void main(String args[]){
// int arr[]={2,6,13,22,35,58,566};
// trap(arr);
// int arr2[]={45,33,23,22,21,20};
// trap(arr);
int arr3[]={0,1,0,2,1,0,1,3,2,1,2,1};
trap(arr3);
int arr4[]={4,2,0,3,2,5};
trap(arr4);
    }
}