public class Box {
    double width;
    double height;
    double length;



    public Box() {
        width=0;
        height=0;
        length =0;
    }

    public Box(double width, double height, double length) {
        this.width=width;
        this.height=height;
        this.length =length;
    }

    public Box(Box box) {
        this.width=box.width;
        this.height=box.height;
        this.length =box.length;
    }

    public Box(double size) {
        width=size;
        height=size;
        length =size;
    }




    public void showInfo() {
        System.out.println("Ширина: " + width);
        System.out.println("Длина: " + length);
        System.out.println("Высота: " + height);
    }

    double volume() {
        return width*height* length;
    }
    void showVolume() {
        System.out.println(volume());
    }

    void compare(Box box) {
        double thisVolume = volume();
        double boxVolume = box.volume();
        if(thisVolume > boxVolume) {
            System.out.println("Наша коробка болше");
        } else if (thisVolume < boxVolume) {
            System.out.println("Наша коробка меньше");
        } else {
            System.out.println("Коробки равны");
        }
    }

    int comparePro(Box box) {
        double thisVolume = volume();
        double boxVolume = box.volume();
        int result;
        if(thisVolume > boxVolume) {
            result = 1;
        } else if (thisVolume < boxVolume) {
            result = -1;
        } else {
            result = 0;
        }
        return result;
    }





    public Box increase(int i) {
        return new Box(width*i, height*i, length *i);
    }






    public int multi(int a, int b) {
        return a+b;
    }
    public double multi(double a, double b) {
        return a+b;
    }
    static int quatr(int a) {
        return a * a;
    }

}
