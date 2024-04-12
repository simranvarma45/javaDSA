public class reverseArray{
public static void reverse(int array[]){
int first=0;
int last=array.length - 1;
while(last>first){
    int temp=array[last];
    array[last]=array[first];
    array[first]=temp;
    first++;
    last--;
}

}
public static void main(String args[]){
    int array[] ={3,5,6,7,23,45,89};
   System.out.print("Array before reversing is : ");
   for(int i=0;i<array.length;i++){
    System.out.print(array[i]+ "  ");
   }
   reverse(array);
   System.out.print("Array after reversing is : ");
   for(int i=0;i<array.length;i++){
    System.out.print(array[i]+ "  ");
   }
}
}