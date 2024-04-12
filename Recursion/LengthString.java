public class LengthString{
    public static int lengthCount(String str){
       if(str.equals("")){
        return 0;
       }
    
      return lengthCount(str.substring(1)) + 1;
         
       
    }
    public static void main(String args[]){
        String str ="simran verma";
        System.out.println(lengthCount(str));
    }
}