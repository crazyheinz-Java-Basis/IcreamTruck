package be.intecbrussel;


public class Stock {
    private int iceRockets;
    private int cones;
    private int balls;
    private int magnums;

    public Stock(int iceRockets, int cones, int balls, int magnums) {
        this.iceRockets = iceRockets;
        this.cones = cones;
        this.balls = balls;
        this.magnums = magnums;
    }

    public int getIceRockets() {
        return iceRockets;
    }

    public void setIceRockets(int iceRockets) {
        this.iceRockets = iceRockets;
    }

    public int getCones() {
        return cones;
    }

    public void setCones(int cones) {
        this.cones = cones;
    }

    public int getBalls() {
        return balls;
    }

    public void setBalls(int balls) {
        this.balls = balls;
    }

    public int getMagnums() {
        return magnums;
    }

    public void setMagnums(int magnums) {
        this.magnums = magnums;
    }
}
