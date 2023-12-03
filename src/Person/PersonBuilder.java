package Person;

public interface PersonBuilder {

    PersonBuilder setName(String name);
    PersonBuilder setAge(int age);
    PersonBuilder setSalary(double salary);
    Person build();

}
