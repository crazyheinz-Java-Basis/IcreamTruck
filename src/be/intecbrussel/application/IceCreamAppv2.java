package be.intecbrussel.application;

import java.util.Arrays;
import be.intecbrussel.eatables.*;
import be.intecbrussel.sellers.*;
import be.intecbrussel.*;


public class IceCreamAppv2 {

    public static void main(String[] args) {

        PriceList pricelist = new PriceList(2.0, 1.0, 1.7);
        Eatable[] iceCreams2 = new Eatable[0];
        Stock stockCar = new Stock(100, 100, 100, 30);
        IceCreamSeller seller2 = new IceCreamCar(pricelist, stockCar);
        WaffleSeller waffleSeller = new WaffleSeller();


        try {


            System.out.println("--------------------------------");
            System.out.println("    De cremekar bestellingen");
            System.out.println("--------------------------------");


            iceCreams2 = addEattable(seller2.orderIceRocket(), iceCreams2);
            iceCreams2 = addEattable(seller2.orderMagnum(MagnumType.MILKCHOCOLATE), iceCreams2);
            iceCreams2 = addEattable(seller2.orderIceRocket(), iceCreams2);
            iceCreams2 = addEattable(seller2.orderIceRocket(), iceCreams2);
            iceCreams2 = addEattable(seller2.orderMagnum(MagnumType.BLACKCHOCOLATE), iceCreams2);
            iceCreams2 = addEattable(seller2.orderMagnum(MagnumType.ALPINENUTS), iceCreams2);
            iceCreams2 = addEattable(seller2.orderMagnum(MagnumType.ROMANTICSTRAWBERRIES), iceCreams2);
            iceCreams2 = addEattable(seller2.orderMagnum(MagnumType.MILKCHOCOLATE), iceCreams2);
            iceCreams2 = addEattable(seller2.orderCone(new Flavor[]{Flavor.STRAWBERRY, Flavor.BANANA, Flavor.STRACIATELLA}), iceCreams2);
            iceCreams2 = addEattable(seller2.orderCone(new Flavor[]{Flavor.STRAWBERRY}), iceCreams2);
            iceCreams2 = addEattable(seller2.orderCone(new Flavor[]{Flavor.STRAWBERRY, Flavor.LEMON}), iceCreams2);
            iceCreams2 = addEattable(seller2.orderCone(new Flavor[]{Flavor.STRAWBERRY, Flavor.LEMON, Flavor.STRACIATELLA, Flavor.PISTACHE}), iceCreams2);


            System.out.println("--------------------------------");
            System.out.println("    wafel shizzle");
            System.out.println("--------------------------------");


            waffleSeller.makeWaffles();
            waffleSeller.eat();

            System.out.println("--------------------------------");
            System.out.println("    let's fucking binge");
            System.out.println("--------------------------------");


            for (int i = 0; i < iceCreams2.length; i++) {

                iceCreams2[i].eat();
            }


        } catch (NoMoreIceCreamException nm) {

            System.out.println();
            System.out.println(nm.getMessage());

        } finally {
            System.out.println("--------------------------------");
            System.out.println("    dikke winsten");
            System.out.println("--------------------------------");
            System.out.println("er is vandaag voor " + ((IceCreamCar) seller2).getProfit() + " euro verkocht geweest met de ijskar");
            System.out.println("er is vandaag voor " + waffleSeller.getTotalProfit() + " euro verkocht geweest met de wafels");

        }
    }

    public static Eatable[] addEattable(Eatable eatableIn, Eatable[] eatableArr) {
        Eatable[] temp = Arrays.copyOf(eatableArr, eatableArr.length + 1);
        temp[eatableArr.length] = eatableIn;
        eatableArr = temp;

        return eatableArr;
    }


}






