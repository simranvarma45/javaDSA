public class largest{
    public static void main(String args[]){
        String fruits[]={"mango","orange","banana","apple","Orange"};
        String largest=fruits[0];
        for(int i=0;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest=fruits[i];
            }
        }
        System.out.println(largest);
    }
}
//compareToIgnoreCase - ignore uppercase and lowercase and treates both as same
//Time complexity = number of elements in array + length of the element
//TC=O(n+m) where n=length of array and m = length of largest element