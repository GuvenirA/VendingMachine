package SnackBar;

import Number42.Coins;

/**
 * This class implements a vendor that sells one kind
 * of items. A vendor carries out sales transactions.
 */
public class Vendor
{
    // Fields:

    private int price;
    private int stock;
    private int deposit;
    private int change;
    private static double totalSales = 0.0;


    /**
     * Constructs a Vendor
     * @param price the price of a single item in cents (int)
     * @param stock number of items to place in stock (int)
     */
    public Vendor(int price, int stock){
        this.price = price;
        this.stock = stock;
    }


    /**
     * Sets the quantity of items in stock.
     * @param qty number of items to place in stock (int)
     */
    public void setStock(int stock) //done? wierd different in teachers parameters, look later
    {
        //You need to complete this using this. notation
        stock = qty;
    }


    /**
     * Returns the number of items currently in stock.
     * @return number of items currently in stock (int)
     */
    public int getStock(){
        return stock;
    }


    /**
     * Adds a specified amount (in cents) to the
     * deposited amount.
     * @param number of cents to add to the deposit (int)
     */
    public void addMoney(int number){
        deposit += number;
    }


    /**
     * Returns the currently deposited amount (in cents).
     * @return number of cents in the current deposit (int)
     */
    public int getDeposit(){
        return deposit;
    }


    /**
     * Implements a sale.  If there are items in stock and
     * the deposited amount is greater than or equal to
     * the single item price, then adjusts the stock
     * and calculates and sets change and returns true;
     * otherwise refunds the whole deposit (moves it into
     * change) and returns false.
     * @return true for a successful sale, false otherwise (boolean)
     */
    public boolean makeSale(){
        if((stock > 0) && (deposit >= price)){
            stock--;
            totalSales += (price / 100.0);
            change = deposit - price;
            deposit = 0;
            return true;
        }else{
            change = deposit;
            return false;
        }
    }


    /**
     * Returns and zeroes out the amount of change (from
     * the last sale or refund).
     * @return number of cents in the current change (int)
     */
    public int getChange()
    {
        int c = change;
        change = 0;
        return c;
    }

    /**
     * Returns the amount of change in quarters, dimes, nickels, and pennies
     *
     * @return change in quarters, dimes, nickels, and pennies
     */
    public String getChangeString(){
        String changeString = "";
        Coins amount = new Coins(change);
        changeString = amount.getQuarters() + "q + " + amount.getDimes() + "d + " +
                amount.getNickles() + "n + " + amount.getPennies() + "p";
        return changeString;
    }

    /**
    * Returns the total dollars of sales and resets the total dollars of sales to 0
    * Hint: use a temp variable
    *
    * @return dollars of sales
    */
    public static double getTotalSales(){
        double temp = totalSales;
        totalSales = 0.0;
        return temp;
    }
}
