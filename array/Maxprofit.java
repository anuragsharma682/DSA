public class Maxprofit {
    public static int getmaxprofit(int prices[]){
        int buy=prices[0];
        int profit=0;
        for(int i=0;i<prices.length;i++){
            if(buy<prices[i]){
                profit=Math.max(prices[i]-buy,profit);
            }
            else{
                buy=prices[i];
            }
        }
        return profit;
    }
    public static void main(String[] args){
        int prices[]={7,1,5,3,6,4};
        System.out.println("max profit is : "+getmaxprofit(prices));
    }
}
