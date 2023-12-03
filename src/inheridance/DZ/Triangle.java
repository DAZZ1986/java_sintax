package inheridance.DZ;

public class Triangle  extends Figure{
    private double c;
    private double size;


    public Triangle(double size) {
        super(size, size);
        this.c = size;
        this.size = size;
    }

    public Triangle(double a, double b, double c) {
        super(a, b);
        this.c = c;
    }



    public double getC() {
        return c;
    }
    public double getSize() {
        return size;
    }




    public double geroneSquare(double size) {
        double p = (size + size + size) / 2;
        return Math.sqrt(p * (p - size) * (p - size) * (p - size));
    }
    @Override
    public double area() {
        double p = (getA() + getB() + c) / 2;
        return Math.sqrt(p * (p - getA()) * (p - getB()) * (p - c));
    }

}
