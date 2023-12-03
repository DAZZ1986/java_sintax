package inheridance.DZ;

public class Rect extends Figure {
    private double size;


    public Rect(double size) {
        super(size, size);
        this.size = size;
    }

    public Rect(double a, double b) {
        super(a, b);
    }





    public double getSize() {
        return size;
    }




    public double area(double size){
        return size * size;
    }
    //Формула для нахождения площади
    @Override
    public double area(){
        return getA() * getB();
    }

}
