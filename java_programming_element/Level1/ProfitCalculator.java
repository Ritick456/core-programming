package Level_1;

public class ProfitCalculator {
    public static void main(String[] args) {
        
        int cost = 129, selling = 191;
        int profit = selling - cost;
        double profitPercent = (profit / (double) cost) * 100;

        System.out.println("The Cost Price is INR " + cost);
        System.out.println("The Selling Price is INR " + selling);
        System.out.println("The Profit is INR " + profit);
        System.out.println("The Profit Percentage is " + profitPercent);
        
                
    }
}
