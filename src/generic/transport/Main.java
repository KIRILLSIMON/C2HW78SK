package generic.transport;

import java.util.Random;

public class Main {
    private static final Random RANDOM=new Random();
    public static void main(String[] args) {
      Car car1=generateCar(1);
      Car car2=generateCar(2);
      Car car3=generateCar(3);
      Car car4=generateCar(4);

      Bus bus5=generateBus(5);
      Bus bus6=generateBus(6);
      Bus bus7=generateBus(7);
      Bus bus8=generateBus(8);

      Truck truck9=generateTruck(9);
      Truck truck10=generateTruck(10);
      Truck truck11=generateTruck(11);
      Truck truck12=generateTruck(12);

    DriverB ivan= new DriverB("Иван",false,1);
    DriverC sergo=new DriverC("Серго",true,41);
    DriverD Kiryuha=new DriverD("Кирилл",true,14);

    ivan.startMove(car1);
    ivan.stopMove(car1);
    ivan.refill(car1);
    ivan.printInfo(car1);

        sergo.startMove(truck11);
        sergo.stopMove(truck11);
        sergo.refill(truck11);
        sergo.printInfo(truck11);

        Kiryuha.startMove(bus7);
        Kiryuha.stopMove(bus7);
        Kiryuha.refill(bus7);
        Kiryuha.printInfo(bus7);

    }

    private static Car generateCar(int number){
        return new Car("VAZ"+number,"2110"+number,1.6,"SEDAN","Five",
                "500kg","",""
        );
    }
    private static Bus generateBus(int number){
        return new Bus("PAZ"+number,"Vector"+number,2.5,
                "UNIVERSAL","43","5tonn","","");
    }
    private static Truck generateTruck(int number){
        return new Truck("ZIL","130",3.8,
                "PICKUP","2","9tonn","","");
    }



}