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


    public double getKerulet(){
        return 2 * (this.getA() + this.b);
    }
    public double getTerulet(){
        return this.getA() * this.b;
    }

    @Override
    public String toString() {
        return String.format("Téglalap: a = %f -  b = %f - K: %f - T: %f",
                this.getA(), this.b, getKerulet(), this.getTerulet());
    }
}
