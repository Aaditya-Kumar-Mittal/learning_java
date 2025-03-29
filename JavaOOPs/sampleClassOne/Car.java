public class Car{

  private String color;
  private String name;
  private String model;
  private int year;
  private int speed;

  // Creating methods for class

  public void accelarate(int increaseSpeedBy)
  {
    speed += increaseSpeedBy;
  }

  public void brake(int decreaseSpeedBy)
  {
    speed -= decreaseSpeedBy;
  }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getSpeed() {
        return speed;
    }

}