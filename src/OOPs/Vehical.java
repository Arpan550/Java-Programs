package OOPs;

public class Vehical {
    public void service(){
        System.out.println("Service in Vehical..");
    }
}

class Car extends Vehical{
    @Override
    public void service() {
        super.service();
        System.out.println("Service in Car..");
    }
}

class TestCase{
    public static void main(String[] args) {
        Vehical veh=new Vehical();
        Car car=new Car();

        veh.service();
        car.service();
    }
}