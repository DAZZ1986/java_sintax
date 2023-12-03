import Modificator.EngineRocket;
import Modificator.Rockets;
import Nascar.*;
import Person.*;
import inheridance.Cat;
import inheridance.DZ.ColorRect;
import inheridance.DZ.Figure;
import inheridance.DZ.Rect;
import inheridance.DZ.Triangle;
import inheridance.Lion;
import main.MyArryaList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //Паттерн builder
/*
        PersonBuilder personBuilder = new PersonBuilderImpl();
        personBuilder.setName("Josh");
        personBuilder.setAge(37);
        personBuilder.setSalary(54.2);

        PersonBuilderImpl personBuilder1 = new PersonBuilderImpl();
        personBuilder1.setName("Dan").setAge(555).setSalary(2222).build();

        Person person = new PersonBuilderImpl()
                .setName("Valy")
                .setAge(22)
                .setSalary(123222)
                .build();

        person.print();

        System.out.println("------------------------------------------------");

        Car RedBull = new CarBuilderImpl()
                .setModel("RB18")
                .setRaceNumber(1)
                .setEngine(new EngineBuilderImpl()
                        .setModel("Honda")
                        .setHorsePower(955)
                        .build())     //тут возвращается в итоге Engine, а не EngineBuilderImpl
                .build();

        RedBull.print();
*/
/*



        System.out.println("\n\n\n//5. Перегрузка методов и конструкторов (см. класс Box)");
        //5. Перегрузка методов и конструкторов (см. класс Box)
        //используем перегрузку только в том случае когда методы действительно выполняют приблизительно одно
        //и тоже действие.
        int a = 2;
        System.out.println(Box.quatr(a));




        System.out.println("\n\n\n//6. Объекты в качестве параметров и возврат объектов");
        //6. Объекты в качестве параметров и возврат объектов
        Box box1 = new Box(5,5,5);
        Box box2 = new Box(10,10,10);

        box1.compare(box2);
        int res = box1.comparePro(box2);

        switch(res) {
            case -1:
                System.out.println("Наша коробка меньше");
                break;
            case 1:
                System.out.println("Наша коробка больше");
                break;
            case 0:
                System.out.println("Коробки равны");
                break;
        }


        //используем конструктор который принимает Box
        Box box11 = new Box(10,10,10);
        Box box22 = new Box(box11);
        int res2 = box11.comparePro(box22);
        switch(res2) {
            case -1:
                System.out.println("Наша коробка меньше");
                break;
            case 1:
                System.out.println("Наша коробка больше");
                break;
            case 0:
                System.out.println("Коробки равны");
                break;
        }

        //метод возвращает объект
        Box box111 = new Box(10,10,10);
        Box box222 = box111.increase(3);
        box111.showVolume();
        box222.showVolume();





        System.out.println("\n\n\n//7. Модификаторы доступа");
        //7. Модификаторы доступа
        //public    - видимость в проекте
        //private   - видимость в файле/классе
        //default   - видимость в пакете
        //protected - видимость в пакете и у наследников класса

        ModificatorDostupa var = new ModificatorDostupa();

        System.out.println(var.defaultVar);     //default
        //System.out.println(var.privateVar);   //private - тут ошибка тк нет доступа к private переменной
        System.out.println(new Rockets().rr);   //public

        System.out.println(var.protectedVar);   //protected в пакете
        //System.out.println(new Rockets().ProtectedInheritVar);   //protected тут ошибка тк вызываю переменную не
        //у наследника а в самом классе где была объявлена переменная, а так делать нельзя, доступ только у наследника
        //класса, в котором данную переменную объявили.

        //protected у наследника - см. классы Rockets и EngineRocket        //protected у наследника





        System.out.println("\n\n\n//8. Ключевые слова static и final и аргументы переменной длины");
        //8. Ключевые слова static и final и аргументы переменной длины

        //static
        //в методе статик можно вызывать только статические переменные, а к переменным объектов метод обращаться не может
        //static - означает что переменная или метод принадлежит классу а не какому либо объекту.
        double lenght = ModificatorDostupa.lenght(10);
        System.out.println(lenght);
        System.out.println("pi = " + ModificatorDostupa.pi);

        double area = ModificatorDostupa.area(10);
        System.out.println(area);
        System.out.println("pi = " + ModificatorDostupa.pi);    //тк переменная статическая она изменяет свое значение
                                                    //тоесть эта переменная общая для всего класса и разных объектов

        //final
        //данную переменную можно инициализировать только один раз и далее менять ее нельзя.
        //если прееменная помечена как static и finale то ее нужно писать заглавными буквами - public static final double PIFINALE = 3.14;
        //если прееменная помечена как static и finale то можно ее сделать public тк ее никто не сможет изменить, но
        //если есть возможность ограничить доступ то лучше его ограничить.
        int sum = ModificatorDostupa.sum(1,2,666,777,9);
        System.out.println(sum);
*/




/*
        System.out.println("\n\n\n//9. Создаем собственную коллекцию");
        //9. Создаем собственную коллекцию

        System.out.println("____________employees____________");
        String[] employees = {
            "Никита",
            "Игорь",
            "Ольга",
            "Василий",
            "Максим"
        };
        for (String item: employees) {
            System.out.println(item);
        }


        System.out.println("____________second____________");
        String[] second = new String[employees.length + 1];
        for (int i=0; i < employees.length; i++){
            second[i] = employees[i];
        }

        for (String item: employees) {
            System.out.println(item);
        }
        System.out.println("_________наняли_уволили_________");
        second[second.length-1] = "Иван";   //наняли на работу
        second[1] = null;                   //уволили
        for (String item: second) {
            System.out.println(item);
        }
        //как итог работать с массивом не удобно если нам нужно часто добавлять или удалять эл. из массива.



        System.out.println("_____________third_____________");
        String third[] = new String[second.length -1];
        for(int i=0, j=0; i<second.length; i++){
            if(second[i] != null){
                third[j] = second[i];
                j++;
            }
        }
        for (String item: third) {
            System.out.println(item);
        }



        System.out.println("_____________Аналог List_____________");
        MyArryaList employees2 = new MyArryaList();
        employees2.add("Nikita");
        employees2.add("Igor");
        employees2.add("Vasy");
        employees2.add("Koly");
        employees2.add("Klava");
        employees2.add("Sergey");
        System.out.println(employees2.getSize());

        employees2.add("DAZZ");
        for (int i=0; i < employees2.getSize(); i++) {
            System.out.println(employees2.get(i));
        }
        System.out.println(employees2.getSize());

        System.out.println("Удаляем существующий элемент с именем DAZZ");
        employees2.remove("DAZZ");
        for (int i=0; i < employees2.getSize(); i++) {
            System.out.println(employees2.get(i));
        }


        System.out.println("Удаляем НЕ существующий элемент с именем DAZZ777");
        employees2.remove("DAZZ777");
*/




/*
        System.out.println("\n\n\n//10. Ключевое слово import, оболочки типов и продвинутая работа со строками");
        //10. Ключевое слово import, оболочки типов и продвинутая работа со строками.
        //Оболочки типов применяюся для:
        //-доп. функционала/методов (н/п: Integer.parseInt(s0);)
        //-указания типов в объявлении коллекций, тк примитивные типы там указывать нельзя (н/п: ArrayList<Integer>)
        byte b;
        Byte bb;
        short s;
        Short ss;
        int in;          //это примитывный тип, он легче в обработке. Это примитив.
        Integer inin;     //это ссылочный тип, он тяжелее в обработке. Это оболочка примитива.
        long l;
        Long ll;
        char ch;
        Character chch;
        float f;
        Float ff;
        double d;
        Double dd;
        boolean bl;
        Boolean bbl;

        //пример когда нужно использовать оболочки
        String s0 = "1000";
        String s00 = "2000";
        System.out.println(s0 + s00);   //тут просто конкатенация строк

        //хотим из строк получить числа
        int a0 = Integer.parseInt(s0);
        int a00 = Integer.parseInt(s00);
        System.out.println(a0 + a00);
        //как ИТОГ видим что оболочки дают нам дополнительные методы для работы с данными.

        //пример с boolean
        String s000 = "true";
        boolean b000 = Boolean.parseBoolean(s000);
        System.out.println(b000);
        //ВАЖНО: в true будет преобразована только строка "true", а любой другой текст будет всегда преобразован в false.


        //другой пример - хотим из строки получить имя и сохранить его в другой переменной.
        String sss = "Это Игорь. Он программист.";
        String name = sss.substring(4, 9);
        System.out.println(name);
*/






/*
        System.out.println("\n\n\n//11. Встроенные коллекции");

        System.out.println("____________коллекция строк___________");
        ArrayList<String> emoloyees = new ArrayList<>();
        emoloyees.add("Sergei");
        emoloyees.add("Kristina");
        emoloyees.add("Elena");
        emoloyees.add("Natalia");
        emoloyees.add("Natalia");
        for (int i=0; i<emoloyees.size(); i++) {
            System.out.println(emoloyees.get(i));
        }

        System.out.println("_______________________");

        emoloyees.remove(0);
        emoloyees.remove("Kristina");
        for (String item: emoloyees) {
            System.out.println(item);
        }


        System.out.println("____________коллекция целых чисел___________");
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i=0; i < 1000; i++) {
            numbers.add(i);
        }
        int sum = 0;
        for (int item: numbers) {
            sum += item;
        }
        System.out.println(sum);



        System.out.println("____________HashSet___________");
        //HashSet особенности:
            //-данные хранятся в РАНДОМНОМ порядке
            //-не хранить повторяющиеся знаачения
            //-к эл. не можем обращаться методом get(), а можем обращаться только в цикле foreach
            //работает быстрее TreeSet, тк НЕ делает сортировку

        HashSet<String> namesHash = new HashSet<>();
        namesHash.add("John");
        namesHash.add("Olga");
        namesHash.add("Ivan");
        namesHash.add("Koly");
        namesHash.add("Ivan");

        for (String item: namesHash) {
            System.out.println(item);
        }


        System.out.println("____________TreeSet___________");
        //____________TreeSet___________ особенности:
            //-данные хранятся в ОТСОРТИРОВАННОМ порядке
            //-не хранить повторяющиеся знаачения
            //-к эл. не можем обращаться методом get(), а можем обращаться только в цикле foreach
            //работает медленнее HashSet, тк делает сортировку
        TreeSet<String> namesTree = new TreeSet<>();
        namesTree.add("John");
        namesTree.add("Olga");
        namesTree.add("Ivan");
        namesTree.add("Koly");
        namesTree.add("Ivan");
        for (String item: namesTree) {
            System.out.println(item);
        }

        TreeSet<Integer> numbersTree = new TreeSet<>();
        numbersTree.add(22);
        numbersTree.add(1);
        numbersTree.add(4);
        numbersTree.add(32);
        numbersTree.add(2);
        for (Integer item: numbersTree) {
            System.out.println(item);
        }

*/




        System.out.println("\n\n\n//12. Наследование часть 1.");
        //Наследованием - мы расширяем функционал дочерних классов.
        //ВАЖНО: Когда мы создаем объект дочернего класса, то невидимым образом вызывается конструктор родительского
        //класса без параметров.
        Cat cat = new Cat();
        Lion lion = new Lion();
        System.out.println("cat: " + cat.getBigClaws());
        System.out.println("lion: " + lion.getBigClaws());
        System.out.println("_________________________");

        cat.showInfo();
        lion.showInfo();
        System.out.println("_________________________");
        cat.eat();
        lion.eat();


        System.out.println("__________DZ__________");

        Box box = new Box(15);
        BoxWeight boxWeight = new BoxWeight(10,20,30,15.5);

        box.showInfo();
        System.out.println("____________");
        boxWeight.showInfo();
        System.out.println("_________________________");







        System.out.println("\n\n\n//13. Наследование часть 2.");
        System.out.println("_________DZ2___________");

        System.out.println("Rect");
        Rect rect = new Rect(10);
        Rect rect2 = new Rect(10, 20);
        System.out.println("Square rect: " + rect.area(rect.getSize()));
        System.out.println("Square rect2: " + rect2.area());

        System.out.println("Triangle");
        Triangle tri = new Triangle(10);
        Triangle tri2 = new Triangle(10, 12, 18);
        System.out.println("Square tri: " + tri.geroneSquare(tri.getSize()));
        System.out.println("Square tri2: " + tri2.area());

        System.out.println("_________________________");

        //Abstract  (см. класс Figure, Triangle, Rect, ColorRect)
        //Особенности абстрактных классов:
        //- нельзя создавать объекты. (нельзя использовать конструктор абстрактного класса)
        //- могут содержать как абстрактные, так и обычные методы
        //- класс, который наследует абстрактный класс, должен реализовать все абстрактные методы базового класса, иначе он тоже должен быть объявлен как абстрактный
        //- если класс имеет хотя бы один абстрактный метод, то данный класс должен быть определен как абстрактный

        //Абстрактный метод - обяжет наследников класса его переопределить. Мы не забудем его переопределить, в отличии
        //от момента если бы мы оставили метод return 0, и тогда компилятор бы не ругался если бы мы его не переопределили
        //и естественно кто нибудь бы потом создал просто эфимерную фигуру и вызвал бы ее метод где вернулся бы 0!

        //Что мы сделали - удалили бесполезную реализацию метода area() и сделали метод abstract и далее вынуждены
        //сделать класс abstract, тк если в классе есть хотябы один абстрактный метод, то и класс должен быть абстрактный.
        //Эта нас убережет от:
        //1) создания объекта класса Figure, тк в нем мы просто создали общие черты всех фигур и далее
        //создали конкретные классы конкретных фигур! Тоесть не бывает просто фигуры, поэтому этот класс родительский и абстрактный.
        //Figure figure = new Figure();       //тут будет ошибка тк класс абстрактный!
        //2) от вызова метода в котором нет реализации, а есть просто заглушка return 0;, и если такой метод вызовут, то
        //будет 100% ошибка в расчетах.
        //System.out.println(figure.area());  //и нам вернется 0, этого допустить нельзя! Поэтому помечаем ключевым
        //словом abstract!
        //ИТОГ: Таким образом мы защитимся от:
        //1) создания объекта класса Figure который в себе несет общие черты всех фигур,
        //2) и от вызова его метода area(), который ничего не делает, поэтому делаем метод abstract.

        //Конструктор(1), Переопределение(2), final(3)  (см. класс ColorRect)
        System.out.println("//Конструктор(1), Переопределение(2), final(3)  (см. класс ColorRect)\n");

        System.out.println("Переопределение");
        //проверка пункта а)
        ColorRect colorRect = new ColorRect(10);
        double ddd = colorRect.area();  //вызывается переопределенный метод из родительского класса Rect, а в классе
        System.out.println(ddd);        //ColorRect такого метода нет вообще, и вызывается из родительского класса.
        System.out.println(colorRect.getA());  //проверка пункта б)







        System.out.println("\n\n\n//14. Интерфейсы часть 1.");
 /*     https://topjava.ru/blog/istoriya-evolutsii-interfeysov-v-java   ТОП СТАТЬЯ!!!!!!!!!!!!!!!!
        Зачем использовать интерфейсы?
        Описание: Мы создали интерфейс Swimmable — «умеющий плавать». Это что-то вроде нашего пульта, у которого есть
        одна «кнопка»: метод swim()  — «плыть».
        Как же нам этот «пульт» использовать?
        Для этого метод, т.е. кнопку нашего пульта, нужно имплементировать. Чтобы использовать интерфейс, его методы
        должны реализовать какие-то классы нашей программы.

        Абстракция: Интерфейсы позволяют определить общий контракт между объектами, скрывая детали реализации.

        Множественное наследование: Java не поддерживает множественное наследование классов, но позволяет классу
        реализовывать несколько интерфейсов.

        Повышение гибкости: Использование интерфейсов делает код более гибким и масштабируемым, так как можно внести
        изменения в реализацию без изменения контракта
*/

        //Особенности интерфейсов:
        //- содержат только объявления методов (абстрактные методы) и константы (статические и финальные переменные)
        //- не могут иметь конструкторов, так как они не могут быть инстанциированы
        //- класс может реализовывать несколько интерфейсов, что позволяет обойти отсутствие множественного наследования в Java

        //Константы:
        //•	поля должны быть проинициализированы
        //•	поля по умолчанию считаются публичными статическими финальными
        //•	модификаторы public, static и final не нужно указывать явно (они «проставляются» по умолчанию)




        //Методы:
        //- все методы в интерфейсе по умолчанию являются публичными и абстрактными
        //- с Java 8, интерфейсы могут содержать статические и дефолтные (с реализацией) методы


        //абстрактные методы:
        //•	у методов нет тела
        //•	реализация методов предоставляется классами, реализующими данный интерфейс
        //•	методы считаются публичными и абстрактными даже, если это не задано явно
        //•	методы не могут быть финальными, поскольку в Java комбинация модификаторов abstract и final запрещена


        //статические методы:
        //- при использовании статических методов нужна реализацию тела метода
        //- статические методы считаются публичными по умолчанию
        //- в отличие от обычных статических методов, статические методы в интерфейсах не наследуются
        //(Это означает, что если вы хотите вызвать такой метод, вы должны вызвать его напрямую из интерфейса, а не из
        //реализующего его класса. MyInterface.staticMethod();     Это поведение очень полезно для избежания проблем
        //при множественном наследовании. Представьте, что у вас есть класс, реализующий два интерфейса. У каждого из
        //интерфейсов есть статический метод с одинаковым именем и сигнатурой. Какой из них должен быть использован в первую очередь?


        //методы по умолчанию:
        //- методы по умолчанию похожи на статические методы тем, что для них вы также должны предоставлять тело.
        //- в отличие от статических методов, методы по умолчанию наследуются классами, реализующими интерфейс. что важно,
        //такие классы могут при необходимости переопределять их поведение.
        //- чтобы объявить метод по умолчанию, просто используйте ключевое слово default.
//        default int doSomething() {
//            return 0;
//        }


        //приватные методы:
//        С появлением Java 8 и введением методов по умолчанию и статических методов, у интерфейсов появилась возможность содержать не только сигнатуры методов, но и их реализации. При написании таких реализаций рекомендуется разделять сложные методы на более простые. Такой код легче переиспользовать, поддерживать и понимать.
//        Для такой цели вы бы использовали приватные методы, поскольку они могут содержать все детали реализации,
//        которые не должны быть видимы и использованы извне.
//        К сожалению в Java 8 интерфейс не может содержать приватные методы. Это означает, что вы можете использовать:
//        1.	Длинные, сложные и трудные в понимании тела методов.
//        2.	Вспомогательные методы, которые являются частью интерфейса. Это нарушает принцип инкапсуляции и
//        загрязняет публичный API интерфейса и классов-реализаций.
//
//        К счастью, начиная с Java 9, вы можете использовать приватные методы в интерфейсах. У них есть следующие особенности:
            //•	у приватных методов есть тело, они не абстрактные
            //•	они могут быть как статическими, так и нестатическими
            //•	они не наследуются классами, реализующими интерфейс, и интерфейсами
            //•	они могут вызывать другие методы интерфейса
            //•	приватные методы могут вызывать другие приватные, абстрактные, статические методы или методы по умолчанию
            //•	приватные статические методы могут вызывать только другие статические и приватные статические методы

//        public interface MyInterface {
//            private static int staticMethod() {
//                return 42;
//            }
//            private int nonStaticMethod() {
//                return 0;
//            }
//        }

























        System.out.println("\n\n\n//15. Интерфейсы часть 2. Анонимные классы.");













































        System.out.println("\n\n\n//00000");
    }
}