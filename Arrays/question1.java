public class question1{
    public static boolean check(int arr[]){
boolean check=false;
for(int i=0;i<arr.length;i++){
for(int j=i+1;j<arr.length;j++){
    if(arr[i]==arr[j]){
        check= true;
        break;
    }
    
}
if(check){
        break;
    }
}
     return check;   
    }
    public static void main(String args[]){
        int arr[]={2,3,4,85,6,5,64,34};
        if(check(arr)){
            System.out.println("Duplicate elements present");
        }
        else{
            System.out.println("No duplicate element found");
        }
    }
}