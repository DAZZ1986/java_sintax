package Interface;

public interface Test {
    //https://topjava.ru/blog/istoriya-evolutsii-interfeysov-v-java

    int MY_CONSTANT = 32;
    public static final int MY_CONSTANT2 = 22;






    //абстрактные методы:
    int woot();
    public abstract String woot2();







    //статические методы:
    public static void woot3(){
        System.out.println("asd");
    }

    //Наследование статических методов
    //MyInterface.staticMethod();







    //методы по умолчанию:
    default int doSomething() {
        return 0;
    }







    //приватные методы
    private static int staticMethod() {
        return 42;
    }

    private int nonStaticMethod() {
        return 0;
    }







    //Вложенность
    class MyClass {
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






    //Обобщенные типы
    /*
    interface Box<T> {
        void insert(T item);
    }

    class ShoeBox implements Box<Shoe> {
        public void insert(Shoe item) {
            //...
        }
    }
     */






    //Конфликты
    /*
    Давайте представим, что у нас есть класс, реализующий два интерфейса. У этих интерфейсов есть метод по умолчанию с
    одинаковыми именем и сигнатурой.
    interface A {
        default int doSomething() {
            return 0;
        }
    }

    interface B {
        default int doSomething() {
            return 42;
        }
    }

    class MyClass implements A, B {
    }
    Теперь один и тот же метод по умолчанию с одной и той же сигнатурой унаследован от двух разных интерфейсов. У
    каждого интерфейса своя реализация этого метода.
    Итак, как наш класс узнает, какую из двух различных реализаций использовать?
    Он и не узнает. Приведенный выше код приведет к ошибке компиляции. Если вам требуется заставить его работать, то
    для этого необходимо переопределить конфликтный метод в вашем классе.
    interface A {
        default int doSomething() {
            return 0;
        }
    }

    interface B {
        default int doSomething() {
            return 42;
        }
    }

    class MyClass implements A, B {

        // Without this the compilation fails
        @Override
        public int doSomething() {
            return 256;
        }
    }
     */


}
