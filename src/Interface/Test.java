package Interface;

public interface Test {
    int WOOT = 32;
    public static final int WOOT2 = 22;


    void woot();
    public abstract void woot2();




    public static void woot3(){
        System.out.println("asd");
    }

    class MyClass {
        //...
    }
    public static class MyClass2 {
        //...
    }

    interface MyOtherInterface {
        //...
    }
    public static interface MyOtherInterface2 {
        //...
    }



    //Перечисления и аннотации
    enum MyEnum {
        FOO, BAR;
    }

    @interface MyAnnotation {
        //...
    }
















}
