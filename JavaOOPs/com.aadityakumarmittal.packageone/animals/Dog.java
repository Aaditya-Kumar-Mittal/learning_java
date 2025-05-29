public class Dog extends Animals {

    public Dog(String name, int age, double weight) {
        super(name, age, weight);
    }

    @Override
    public void makeNoise() {
        System.out.println("The dog barks.");
    }

}
