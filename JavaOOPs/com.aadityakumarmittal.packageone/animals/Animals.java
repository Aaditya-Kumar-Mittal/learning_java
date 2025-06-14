public class Animals {
    private String name;
    private int age;
    private double weight;

    public Animals(String name, int age, double weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public void makeNoise() {
        System.out.println("The animal makes a noise.");
    }
}
