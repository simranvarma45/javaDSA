public class classObject{
    public static void main(String args[]){
Color o1= new Color();
// System.out.println(o1.color);
System.out.println(o1.getcolor());
o1.setcolor("yellow");
System.out.println(o1.getcolor());
// System.out.println(o1.tip);
System.out.println(o1.getTip());
o1.setTip(7);
System.out.println(o1.getTip());
BankDetails obj = new BankDetails();
obj.name="simran";
obj.setpassword("sim5555");
    }
}
class Color{
       private String color="red";
       private int tip=4;
        void setcolor(String Color){
            this.color=Color;
            
        }
        
        void setTip(int tip){//setter
            this.tip=tip;
        }
        String getcolor(){//getter
            return this.color;
        }
        int getTip(){
            return this.tip;
        }
    
    }
    class BankDetails{
        public String name ;
        private String password;
        public void setpassword(String pswd){//we cannot access password as it is private 
        //but we can set this password
            password = pswd;
        }
    }
 