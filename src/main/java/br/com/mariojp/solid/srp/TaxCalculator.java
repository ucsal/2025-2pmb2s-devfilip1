package br.com.mariojp.solid.srp;

public class TaxCalculator {
    private double rate = 0.10;

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double calculator(Order order) {
        double price = 0;
        for (Item i : order.getItems()){
            price += i.getUnitPrice() * i.getQuantity();
        }
        return price * this.rate;
    }
}
