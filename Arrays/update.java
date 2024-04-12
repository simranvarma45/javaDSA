public class update{
public static void updtodate(int marks[]){
    for(int i=0;i<marks.length;i++){

        marks[i]=marks[i]+1;
    }
}
public static void main(String args[]){
    int marks[]={98,78,99};
    System.out.println("Marks before updation are : ");
    for(int i=0;i<marks.length;i++){
        System.out.print(marks[i]+ " ");
    }
    System.out.println();
    updtodate(marks);
    System.out.println("Marks after  updation are : ");
    for(int i=0;i<marks.length;i++){
        System.out.print(marks[i]+ " ");
    }
}
}