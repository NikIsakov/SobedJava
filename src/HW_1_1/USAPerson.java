package HW_1_1;

public class USAPerson implements PersonBuilder{
    @Override
    public Person build() {
        Person person = new Person("John","Smith","none",
                "USA","New-York","+19998889922",30,"man");
        return person;
    }
}
