package hu.petrik.Orai1004;

public class Paralelogramma extends Sokszog{

    private double b;

    public Paralelogramma(Double a, double b) {
        super(a);
        this.b = b;
    }

    @Override
    public double getKerulet() {
        return 2 * (this.getA() + this.b);
    }

    @Override
    public double getTerulet() {
        return this.getA() * this.b * Math.sin();
    }
}
