package be.intecbrussel.sellers;

import be.intecbrussel.NoMoreIceCreamException;
import be.intecbrussel.PriceList;
import be.intecbrussel.Stock;
import be.intecbrussel.eatables.*;

public interface IceCreamSeller {

    public Cone orderCone(Flavor[] flavor) throws NoMoreIceCreamException;

    public IceRocket orderIceRocket () throws NoMoreIceCreamException;

    public Magnum orderMagnum(MagnumType type) throws NoMoreIceCreamException;




}
