package Modificator;

public class EngineRocket extends Rockets {

    int asd = new Rockets().ProtectedInheritVar;    //вызываем переменную ProtectedInheritVar либо через конструктор

    void testAccess() {
        int var1 = this.ProtectedInheritVar;        //вызываем переменную ProtectedInheritVar либо в методе
        this.testMethodProtected();
    }



}
