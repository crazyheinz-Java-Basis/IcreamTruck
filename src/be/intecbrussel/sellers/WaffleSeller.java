package be.intecbrussel.sellers;

import be.intecbrussel.NoMoreIceCreamException;
import be.intecbrussel.PriceList;
import be.intecbrussel.Stock;
import be.intecbrussel.eatables.*;

public class WaffleSeller implements Eatable  {
    private double totalProfit;

    class Waffle {
        private double price = 2;

        public double getPrice() {
            return price;
        }

    }

    public void makeWaffles() {
        System.out.println("De wafel wordt klaargemaakt");
        Waffle waffle = new Waffle();
        totalProfit += waffle.getPrice();

    }

    public double getTotalProfit() {
        return totalProfit;
    }

    @Override
    public void eat() {
        System.out.println("Ik ben een lekker vette wafel aan het eten");

    }


}
