package levelOne;

public class ProfitLossCalculator {
    public static void main(String[] args) {

        double buyingPrice = 129;
        double sellingAmount = 191;

        double profitValue = sellingAmount - buyingPrice;
        double profitPercent = (profitValue / buyingPrice) * 100;

        System.out.println(
                "The Cost Price is INR " + buyingPrice + " and Selling Price is INR " + sellingAmount + "\n" +
                        "The Profit is INR " + profitValue + " and the Profit Percentage is " + profitPercent
        );
    }
}
