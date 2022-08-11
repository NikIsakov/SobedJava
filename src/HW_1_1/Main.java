package HW_1_1;

public class Main {
    public static void main(String[] args) {
        PersonBuilder builder = new RussianPerson();
        AutomotiveCreate create = new AutomotiveCreate(builder);
        Person person = create.createPerson();
        System.out.println(person);

        PersonBuilder builder1 = new USAPerson();
        AutomotiveCreate create1 = new AutomotiveCreate(builder1);
        Person person1 = create1.createPerson();
        System.out.println(person1);
    }
}
