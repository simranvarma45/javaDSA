public class buySellStock{
    public static int profit(int price[]){
int bp=Integer.MAX_VALUE,sp=Integer.MIN_VALUE;
int maxprofit=0,profit,s=0,p=0;
// int price=0,check1=0;
// for(int i=0;i<price.length -1;i++){
//     if(price[i]<price[i+1]){
//         check1=1;
//     }
//     else 
//     {
//         check1=0;
//         break;

//     }
    
// }
// for(int i=0;i<price.length -1;i++)
// {
//     bp=Math.min(bp,price[i]);   
//     sp=Math.max(price[i],price[i+1]);
//     prevprofit=profit;
//     profit=sp-bp;
//     if(profit<0||check1==1){
//         profit=0;
//     }
//     profit=Math.max(profit,prevprofit);
// }

for(int i=0;i<price.length -1;i++){
if(bp<price[i]){
  profit=price[i]-bp;
maxprofit=Math.max(maxprofit,profit);
if(profit==maxprofit){
     s=i+1;
}

}else{
    bp=price[i];
    p=i+1;
}

}
System.out.println("Stock were bought at day "+ p);
System.out.println("Maximum profit is archieved at day " + s);
return maxprofit;
    }
    public static void main(String args[]){
        int price[]={7,5,4,3,2,1};
        System.out.println("Maximum profit archieved is "+ profit(price));
         int price1[]={7,1,5,3,6,4};
        System.out.println("Maximum profit archieved is "+ profit(price1));

    }
}