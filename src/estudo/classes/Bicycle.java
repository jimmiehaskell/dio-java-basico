package estudo.classes;

public class Bicycle {
    int cadence = 0;
    int speed = 0;
    int gear = 1;

    void changeCadence(int newValue) {
        cadence = newValue;
    }

    void changeGear(int newValue) {
        gear = newValue;
    }

    void speedUp(int increment) {
        speed = speed + increment;
    }

    public static void main(String[] args) {
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();

        bike1.changeCadence(50);
        bike1.changeGear(2);
        bike1.speedUp(10);

        System.out.println("Bike 1: " + bike1.cadence + " " + bike1.gear + " " + bike1.speed);

        bike2.changeCadence(30);
        bike2.changeGear(3);
        bike2.speedUp(20);

        System.out.println("Bike 2: " + bike2.cadence + " " + bike2.gear + " " + bike2.speed);
    }
}
