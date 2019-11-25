package be.intecbrussel;

import be.intecbrussel.eatables.MagnumType;

public class PriceList {
    private double magnumStandardPrice;
    private double ballPrice;
    private double rocketPrice;

    public PriceList() {
        super();
    }

    public PriceList(double magnumStandardPrice, double ballPrice, double rocketPrice) {
        this.magnumStandardPrice = magnumStandardPrice;
        this.ballPrice = ballPrice;
        this.rocketPrice = rocketPrice;
    }

    public void setMagnumStandardPrice(double magnumStandardPrice) {
        this.magnumStandardPrice = magnumStandardPrice;
    }

    public void setBallPrice(double ballPrice) {
        this.ballPrice = ballPrice;
    }

    public void setRocketPrice(double rocketPrice) {
        this.rocketPrice = rocketPrice;
    }


    public double getBallPrice() {
        return ballPrice;
    }

    public double getRocketPrice() {
        return rocketPrice;
    }

    public double getMagnumPrice(MagnumType type) {
        double price = 0;

        if (type.equals(MagnumType.ALPINENUTS) || type.equals(MagnumType.ROMANTICSTRAWBERRIES) ) {
            price = magnumStandardPrice * 1.5;

        } else price = magnumStandardPrice;

        return magnumStandardPrice;
    }
}
