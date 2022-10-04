package hu.petrik.Orai1004;

public class Téglalap extends Sokszog {
    private Double b;

    public Téglalap(Double a, Double b) {
        super(a);
        this.b = b;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

    @Override
    public double getKerulet(){
        return 2 * (this.getA() + this.b);
    }
    @Override
    public double getTerulet(){
        return this.getA() * this.b;
    }

    @Override
    public String toString() {
        return String.format("Téglalap: a = %-10.3f b = %-10.3f %s",
                this.getA(), this.b, super.toString());
    }
}
