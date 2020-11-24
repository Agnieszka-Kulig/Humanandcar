public class Main {

    public static void main(String[] args) {

        Human a = new Human();
        a.setFirstName("Olek");
        a.setAge(45);
        a.setLastName("Miko");
        a.setEyeColor("blue");


        System.out.println(a.getFirstName());
        System.out.println(a.getLastName());
        System.out.println(a.getAge());
        System.out.println(a.getEyeColor());

        Car tesla = new Car(2018, "Tesla", "Model S", "black", 385.0);
        System.out.println("car " + tesla.producer + " year of production " + tesla.yearOfProduction + " model - " + tesla.model + " color " + tesla.color + " power " + tesla.power);
    }
}
