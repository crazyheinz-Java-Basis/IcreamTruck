package be.intecbrussel.eatables;

public class Magnum implements Eatable {
    @Override
    public void eat() {
        System.out.println("Ik ben een lekkere " + getType().name().toLowerCase() + " magnum aan het eten");
    }

    MagnumType type;

    public Magnum() {
        super();
    }

    public Magnum(MagnumType type) {
        this.type = type;
    }

    public MagnumType getType() {
        return type;
    }


}
