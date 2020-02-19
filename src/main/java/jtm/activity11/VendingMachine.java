package jtm.activity11;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public class VendingMachine {


    private double coinsInMachine;
    private Map<String, Double> products;

    public VendingMachine() {
        this.coinsInMachine = 0.0;
    }

    /*
     * TODO
     * Register product to vending machine, by getting product name and price
     * Product catalog should be non case sensitive
     * e.g. if product with name snickers is registered, it should be accessible
     * from chooseProduct method by snickers,SNICKERS,sNickers etc.
     */
    public void addProducts(String product, Double price) {
        if (products == null) {
            this.products = new HashMap<>();
            this.products.put(product.toLowerCase(), price);
        } else {
            this.products.put(product.toLowerCase(), price);
        }
    }

    /*
     * TODO
     * Add deposited coins to balance
     */
    public void depositCoins(double value) {
        this.coinsInMachine += value;
    }

    /*
     * TODO
     * Return balance formatted in a form 0.00$ e.g. 8.50$
     */
    public String balance() {
        return String.format(Locale.US, "%.2f$", this.coinsInMachine);
    }

    /*
     * TODO
     * Method that purchases product from vending machine.
     *
     * If product is available in the catalog and user has enough coins
     * return the product name and return remaining balance to user
     * If user does not have enough coins return "Balance not enough"
     */
    public String chooseProduct(String product) {
        if (this.products.get(product.toLowerCase()) == null) {
            return null;
        }
            //OR use this.products.get(product)!=null
            if (this.coinsInMachine > this.products.get(product.toLowerCase())) {
                this.coinsInMachine = this.coinsInMachine - this.products.get(product.toLowerCase());
                return product;
            } else return "balance not enough";

    }

    /*
     * TODO return user all remaining balance and set current machine
     * balance to 0.00
     */
    public double ejectCoinsBack() {
        double change = this.coinsInMachine;
        this.coinsInMachine = 0.00;
        return change;
    }

}
