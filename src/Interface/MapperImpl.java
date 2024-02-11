package Interface;

public class MapperImpl implements Mapper{

    //тоесть если интерфейс Mapper имеет наследников Mappable то класс MapperImpl который имплементирует родительский
    //интерфейс должен реализовать все методы родительского интерфейса, а так же все методы всех наследников данного
    //родительского интерфейса, тоесть методы интерфейса Mappable.

    @Override
    public void send() {

    }

    @Override
    public void arrive() {

    }
}
