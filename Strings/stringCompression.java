public class stringCompression{
    
    public static String compression(String str){
        
        StringBuilder st=new StringBuilder();
    
        for(int i=0;i<str.length();i++){
            Integer count=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1) ){
count++;
i++;
System.out.print(i + " ");
            }
            st.append(str.charAt(i));
            if(count!=1){
                st.append(count.toString()); 
            }
            
        }
        return st.toString();
    }

    public static void main(String args[]){
        String str="aaabbcccdd";
        System.out.println(compression(str));
    }
}
// public class stringCompression{
    
//     public static String compression(String str){
        
//         String st="";
    
//         for(int i=0;i<str.length();i++){
//             Integer count=1;
//             while( i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
// count++;
// i++;

//             }
        
//             st+=str.charAt(i);
//             if(count!=1){
//                 st+=count.toString(); 
//             }
            
//         }
//         return st;
//     }
//     public static void main(String args[]){
//         String str="aaabbcccdd";
//         System.out.println(compression(str));
//     }
// }