package be.intecbrussel.application;

import be.intecbrussel.NoMoreIceCreamException;
import be.intecbrussel.PriceList;
import be.intecbrussel.sellers.*;
import be.intecbrussel.eatables.*;

import java.util.Arrays;

public class IceCreamApp {

    public static void main(String[] args) {

        System.out.println("--------------------------------");
        System.out.println("    De salon bestellingen");
        System.out.println("--------------------------------");
        PriceList pricelist = new PriceList(3.0,2.0, 2.5);

        IceCreamSeller seller1 = new IceCreamSalon(pricelist);
        Eatable[] iceCreams = new Eatable[0];


        try {
            iceCreams = addEattable(seller1.orderCone((new Flavor[] {Flavor.STRAWBERRY,Flavor.BANANA,Flavor.STRACIATELLA})),iceCreams);
            iceCreams = addEattable(seller1.orderIceRocket(),iceCreams);
            iceCreams = addEattable(seller1.orderMagnum(MagnumType.ALPINENUTS),iceCreams);
            iceCreams = addEattable(seller1.orderMagnum(MagnumType.MILKCHOCOLATE),iceCreams);
            iceCreams = addEattable(seller1.orderMagnum(MagnumType.WHITELCHOCOLATE),iceCreams);
            iceCreams = addEattable(seller1.orderIceRocket(),iceCreams);
            iceCreams = addEattable(seller1.orderIceRocket(),iceCreams);
            iceCreams = addEattable(seller1.orderCone((new Flavor[] {Flavor.LEMON,Flavor.PISTACHE})),iceCreams);
            iceCreams = addEattable(seller1.orderCone((new Flavor[] {Flavor.STRACIATELLA,Flavor.PISTACHE})),iceCreams);
            iceCreams = addEattable(seller1.orderCone((new Flavor[] {Flavor.STRACIATELLA,Flavor.MOKKA})),iceCreams);

            /**   here we eat the food                 **/
            for (int i = 0; i < iceCreams.length; i++) {
                iceCreams[i].eat();
            }
        }

        catch (NoMoreIceCreamException nm) {

            System.out.println();
            System.out.println(nm.getMessage());
        }

        finally {
            System.out.println("--------------------------------");
            System.out.println("    dikke winsten");
            System.out.println("--------------------------------");
            System.out.println("er is vandaag voor " + ((IceCreamSalon) seller1).getProfit() + " euro verkocht geweest met het ijssalon");
        }
    }

    public static Eatable[] addEattable(Eatable eatableIn, Eatable[] eatableArr) {
        Eatable[] temp = Arrays.copyOf(eatableArr, eatableArr.length + 1);
        temp[eatableArr.length] = eatableIn;
        eatableArr = temp;

        return eatableArr;
    }




}
