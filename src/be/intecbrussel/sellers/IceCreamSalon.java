package be.intecbrussel.sellers;

import be.intecbrussel.NoMoreIceCreamException;
import be.intecbrussel.PriceList;
import be.intecbrussel.Stock;
import be.intecbrussel.eatables.*;

/**
 * The class represents an Ice cream salon
 *  @author Hannes De Backer
 */
public class IceCreamSalon implements Profitable,IceCreamSeller {

    private PriceList priceList;
    private double totalProfit;

    /**
     * Constructor
     *
     * @param priceList the pricelist
     */
    public IceCreamSalon(PriceList priceList) {
        this.priceList = priceList;
    }

    /**
     *  gets the total amount of profits
     *
     * @return double
     */
    @Override
    public double getProfit() {

        return totalProfit;
    }

    /**
     *  orders a cone and adds the money earned from the order to the profit
     *
     * @param flavor array of falvours
     * @return Cone object
     */
    @Override
    public Cone orderCone(Flavor[] flavor) {
        Cone cone = new Cone(flavor);
        System.out.println("de cone met " + flavor.length + " ballen wordt klaargemaakt");
        totalProfit += priceList.getBallPrice() * flavor.length;

        return cone;
    }

    /**
     * orders a icerocket and adds the money earned from the order to the profit
     *
     * @return IceRocket
     */
    @Override
    public IceRocket orderIceRocket() {
        IceRocket iceRocket = new IceRocket();
        System.out.println("de icerocket wordt klaargemaakt");
        totalProfit += priceList.getRocketPrice();

        return iceRocket;
    }

    /**
     * orders a magnum and adds the money earned from the order to the profit
     *
     * @param type type of mangnum enum
     * @return Magnum
     */

    @Override
    public Magnum orderMagnum(MagnumType type) {
        Magnum magnum = new Magnum(type);
        System.out.println("de magnum met " + type.name().toLowerCase() +  " smaak wordt klaargemaakt");
        totalProfit += priceList.getMagnumPrice(type);

        return magnum;
    }

    /**
     * Can be used to print something
     *
     * @return a String
     */
    @Override
    public String toString() {
        return "IceCreamSalon{" +
                "priceList=" + priceList +
                ", totalProfit=" + totalProfit +
                '}';
    }


}
