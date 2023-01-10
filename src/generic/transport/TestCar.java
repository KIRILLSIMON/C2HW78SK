package generic.transport;

import enums.BodyType;

public class TestCar {
    public static void main(String[] args) {
        testGeneric();
    }

    private static void testGeneric() {
        Car audi=new Car("audi",
                "Q8",1000,
                "SEDAN","5","600","N1",
                "M1", BodyType.HETCHBACK);
        System.out.println(audi);
    DriverB<Car> driverB=new DriverB<>("Ivanov Ivan Ivanovich",true,20);
        System.out.println(driverB.getCarMessage(audi));
    Truck B901=new Truck("super TRUCK",
                "B-901",901,"PICKUP","One",
                "five hundred thousands kg",
                "N3","M1");
        System.out.println(B901);
    }
    DriverC<Truck> driverC=new DriverC("Georgyi",true,4);

    private static void testEnums() {
        Bus mersedes=new Bus(
                "Mercedes","Connecto",6.7,"UNIVERSAL","54",
                "7.5tonn","N1","M3"
        );
        DriverD<Bus> driverD=new DriverD<>("Stanislav",true,1);
        System.out.println(mersedes);

            Mechanic<Car> mechanic1=new Mechanic<>("Sergey Ivanov","STO1");
    }
}
