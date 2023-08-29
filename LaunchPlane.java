abstract class Plane{

    abstract void takeOff();

    abstract void fly();

    void land();
}

class PassengerPlane extends Plane{
    void takeOff() {
        System.out.println("PassengerPlane is taking off on long run-way");
    }

    void fly() {
        System.out.println("PassengerPlane is flying on low altitude");
    }

    void land() {
        System.out.println("PassengerPlane is landing on long run-way");
    }

    void carryPassengers() {
        System.out.println("Passenger Plane is carrying Passengers");
    }
}

class CargoPlane extends Plane{
    void takeOff() {
        System.out.println("CargoPlane is taking off on medium size run-way");
    }

    void fly() {
        System.out.println("CargoPlane is flying on medium altitude");
    }

    void land() {
        System.out.println("CargoPlane is landing on medium size run-way");
    }

    void carryCargo(){
        System.out.println("Cargo Plane is carrying cargo");
    }
}

class FighterPlane extends Plane{
    void takeOff() {
        System.out.println("FighterPlane is taking off on short size run-way");
    }

    void fly() {
        System.out.println("FighterPlane is flying on high altitude");
    }

    void land() {
        System.out.println("FighterPlane is landing on short size run-way");
    }

    void carryArms() {
        System.out.println("Fighter Plane is carrying Weapons");
    }
}

public class LaunchPlane {

    public static void main(String[] args) {

        PassengerPlane pp = new PassengerPlane();
        CargoPlane cp = new CargoPlane();
        FighterPlane fp = new FighterPlane();

        Sky.permit(pp);
        Sky.permit(cp);
        Sky.permit(fp);

    }

}

class Sky{
    static void permit(Plane p) {
        p.takeOff();
        p.fly();
        p.land();
    }
}
