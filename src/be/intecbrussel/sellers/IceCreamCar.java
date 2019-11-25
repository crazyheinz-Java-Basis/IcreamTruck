package be.intecbrussel.sellers;

import be.intecbrussel.NoMoreIceCreamException;
import be.intecbrussel.PriceList;
import be.intecbrussel.Stock;
import be.intecbrussel.eatables.*;




public class IceCreamCar implements Profitable,IceCreamSeller {

    private PriceList priceList;
    private Stock stock;
    private double totalProfit;

    public IceCreamCar(PriceList priceList, Stock stock) {
        this.priceList = priceList;
        this.stock = stock;
    }

    @Override
    public Cone orderCone(Flavor[] flavor) throws NoMoreIceCreamException {
        if (stock.getCones() > 0 && stock.getBalls() > flavor.length ) {
            totalProfit += priceList.getBallPrice() * flavor.length;
            return prepareCone(flavor);
        }
        else {
            throw new NoMoreIceCreamException("de kroontjes en/of bollen zijn op, bestel iets anders");

        }
    }

    private Cone prepareCone(Flavor[] flavor) throws NoMoreIceCreamException {
        Cone cone = new Cone(flavor);
        stock.setCones(stock.getCones()-1);
        stock.setBalls(stock.getBalls()-flavor.length);
        System.out.println("de cone met " + flavor.length + " ballen wordt klaargemaakt");
        return cone;
    }

    @Override
    public IceRocket orderIceRocket() throws NoMoreIceCreamException {

        if (stock.getIceRockets() > 0) {
            totalProfit += priceList.getRocketPrice();
            return prepareIceRocket();
        }

        else {
            throw new NoMoreIceCreamException("de icerockets zijn op, bestel iets anders");

        }
    }

    private IceRocket prepareIceRocket(){

        IceRocket iceRocket = new IceRocket();
        System.out.println("de icerocket wordt klaargemaakt");
        stock.setIceRockets(stock.getIceRockets() - 1);

        return iceRocket;
    }

    @Override
    public Magnum orderMagnum(MagnumType type) throws NoMoreIceCreamException {
        if (stock.getMagnums() > 0 ) {
            totalProfit += priceList.getMagnumPrice(type);
            return prepareMagnum(type);
        }
        else {
            throw new NoMoreIceCreamException("de magnums zijn op, bestel iets anders");

        }

    }

    private Magnum prepareMagnum(MagnumType magnumType) {
        Magnum magnum = new Magnum(magnumType);
        System.out.println("de magnum met " + magnumType.name().toLowerCase() +  " smaak wordt klaargemaakt");
        stock.setMagnums(stock.getMagnums()-1);

        return magnum;
    }

    @Override
    public double getProfit() {
        return totalProfit;
    }
}
