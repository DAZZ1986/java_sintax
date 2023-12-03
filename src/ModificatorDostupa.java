public class ModificatorDostupa {

    int defaultVar = 22;
    private int privateVar = 33;
    protected int protectedVar = 200;

    public static double pi = 3.14;
    public static final double PIFINALE = 3.14;



    public static double lenght(double radius) {
        return 2 * pi * radius;
    }

    public static double area(double radius) {
        pi = 10;          //статическая переменная изменится для всех объектов класса после ее переприсвоения
        //PIFINALE = 10;   //тут будт ошибка и как следствие мы не сломаем логику вычисления длины и окружности, так где используется число pi
        return pi * radius * radius;
    }


    //мы не знаем сколько данный метод будет принимать параметров -
    // а) как вариант можно сделать массив в качестве параметра, int[] numbers и в цикле произвести суммирование всех
    //значений и вернуть сумму всех значений, но при вызове этого метода будет много заморочек, тк в качества аргумента
    //нужно будет создать массив и передавать ему нужные значение.
    // б) в java есть такой способ как аргумент перименной длины на случай если мы знаем сколько параметров передаст
    //пользователь - int... numbers . Так же внутри метода с этой переменной мы можем работаь как с массивом
    public static int sum(int... numbers) {
        int sum = 0;
        for (int item: numbers) {
            sum += item;
        }
        return sum;
    }
}
