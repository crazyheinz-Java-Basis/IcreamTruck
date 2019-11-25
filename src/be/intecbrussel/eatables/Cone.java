package be.intecbrussel.eatables;

public class Cone implements Eatable {

    Flavor[] balls = new Flavor[0];

    public Cone() {
        super();
    }

    public Cone(Flavor[] balls) {
        this.balls = balls;
    }

    @Override
    public void eat() {
        System.out.println("Ik ben een lekkere cone aan het eten met " + balls.length + " ballen");
    }




}
