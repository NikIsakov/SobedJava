package HW_1_1;

public class RussianPerson implements PersonBuilder{
    @Override
    public Person build() {
        Person person = new Person("Ivan","Ivanov","Ivanovich",
                "Russia","St.Petersburg","89998889922",30,"man");
        return person;
    }
}
