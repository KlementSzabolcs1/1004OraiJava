package hu.petrik.Orai1004;

public class Háromszög extends Sokszog {
    private Double b;
    private Double c;


    public Háromszög(){
        super(getVeletlenOldal());
        this.b = getVeletlenOldal();
        this.c = getVeletlenOldal();
        while (!isSzerkesztheto()) {
            super.setA(getVeletlenOldal());
            this.b = getVeletlenOldal();
            this.c = getVeletlenOldal();
        }
    }

    private static double getVeletlenOldal() {

        return Math.random() * 10 + 5;
    }


    public Háromszög(Double a, Double b, Double c) {
        super(a);
        this.b = b;
        this.c = c;
        if (!this.isSzerkesztheto()) {
            throw new IllegalArgumentException("A megadott hárömszög nem megszerkeszthető!");
        }
        else {

        }
    }

    public Double getB() {
        return b;
    }

    public Double getC() {
        return c;
    }

    public void setB(Double b) {
        this.b = b;
        if (!this.isSzerkesztheto()) {
            throw new IllegalArgumentException("A megadott hárömszög nem megszerkeszthető!");
        }
    }

    public void setC(Double c) {
        this.c = c;
        if (!this.isSzerkesztheto()) {
            throw new IllegalArgumentException("A megadott hárömszög nem megszerkeszthető!");
        }
    }

    @Override
    public void setA(Double a) {
        super.setA(a);
        if (!this.isSzerkesztheto()) {
            throw new IllegalArgumentException("A megadott hárömszög nem megszerkeszthető!");
        }
    }

    private boolean isSzerkesztheto(){
        if (this.getA() + b <= c || this.getA() + c <= b || b + c <= this.getA()){
            return false;
        }
        else {
            return true;
        }
    }

    @Override
    public double getKerulet(){

        return this.getA() + this.getB() + this.getC();
    }

    private double getS(){
        return getKerulet() / 2;
    }

    @Override
    public double getTerulet(){
        return Math.sqrt(this.getS() * (this.getS() - this.getA()) * (this.getS() - this.getB())
                * (this.getS() - this.getC()));
    }


    @Override
    public String toString() {
        return String.format("Háromszög: a = %-10.3f b = %-10.3f c = %-10.3f%s",this.getA(),this.getB(),this.getC(),
                super.toString());
    }
}
