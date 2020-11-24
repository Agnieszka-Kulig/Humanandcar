public class Car {
    final public Integer yearOfProduction;
    final public String producer;//
    final public String model;//
    final public String color;
    final public Double power;

    public Car(Integer yearOfProduction, String producer, String model, String color, Double power) {

        this.yearOfProduction = yearOfProduction;
        this.producer = producer;
        this.model = model;
        this.color = color;
        this.power = power;
    }
}