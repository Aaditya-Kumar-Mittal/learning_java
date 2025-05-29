public class Main {
  public static void main(String[] args) {

    Car car1 = new Car();

    car1.setColor("Blue");
    car1.setModel("Honda");
    car1.setName("Civic");
    car1.setYear(2020);

    car1.accelarate(10);
    car1.accelarate(20);
    car1.accelarate(20);
    car1.accelarate(20);

    System.out.println("Information about Car: " + car1.getName() + " " + car1.getModel() + " " + car1.getYear() + " "
        + car1.getColor() + " " + car1.getSpeed());
  }
}
