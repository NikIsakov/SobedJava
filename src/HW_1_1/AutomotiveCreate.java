package HW_1_1;

public class AutomotiveCreate {
    private PersonBuilder builder;

    public AutomotiveCreate(PersonBuilder builder) {
        super();
        this.builder = builder;
        if (this.builder == null) {
            throw new IllegalArgumentException("Automotive Create can't work without Person Builder!");
        }
    }

    public Person createPerson(){
        return builder.build();
    };
}
