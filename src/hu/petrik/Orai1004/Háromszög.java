package hu.petrik.Orai1004;

public class Háromszög extends Sokszog {
    private Double b;
    private Double c;

    public Háromszög(Double a, Double b, Double c) {
        super(a);
        this.b = b;
        this.c = c;
    }

    public Double getB() {
        return b;
    }

    public Double getC() {
        return c;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public void setC(Double c) {
        this.c = c;
    }

    private boolean getSzerkesztheto(){
        if (this.getA() + b <= c || this.getA() + c <= b || b + c <= this.getA()){
            return false;
        }
        else {
            return true;
        }
    }

    private double getKerulet(){

        return this.getA() + this.getB() + this.getC();
    }

    private double getS(){
        return getKerulet() / 2;
    }
    private double getTerulet(){
        return Math.sqrt(this.getS() * (this.getS() - this.getA()) * (this.getS() - this.getB())
                * (this.getS() - this.getC()));
    }

}
