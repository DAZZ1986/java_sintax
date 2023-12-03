package inheridance;

public class Lion extends CatFamily{




    //при создании объектов дочернего класса, всегда вызывается конструктор радительского класса
    public Lion() {         //если мы в ручную не создали данный конструктор, то он создается автоматически
        super(2,4,true);
    }





    @Override   //аннотация проверяет, что метод который мы прееопределяем реально существует
    public void eat() {
        super.eat();
        System.out.println(" антилопу");
    }



}
