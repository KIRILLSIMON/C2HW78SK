package generic.transport;

public class Car extends Transport implements Competing {


    public Car(String brand, String model, double engineVolume,String bodyType,String MaxNumPassengers,
               String MaxWeightOnBoard,String cargoCategory,String passengersCategory){
        super(brand, model, engineVolume,bodyType,MaxNumPassengers,MaxWeightOnBoard,cargoCategory,passengersCategory);
    }

    @Override
    public void start() {
        System.out.println("Автомобиль\""+getBrand()+"\"(\""+getModel()+"\") начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Автомобиль\""+getBrand()+"\"(\""+getModel()+"\") закончил движение");
    }

    @Override
    public boolean passDiagnostic() {
        System.out.println("Автомобиль "+getBrand()+getModel()+"НЕ требует диагностики");
        return false;
    }

    @Override
    public void repair() {
        System.out.println("Автомобиль "+getBrand()+getModel()+"НЕ требует ремонта!");
    }
    @Override
    public void pitStop() {
        System.out.println("Автомобиль прошёл ПИТ-СТОП");
    }

    @Override
    public int bestLoopTime() {
        return (int) (Math.random()*7);
    }

    @Override
    public int maxSpeed() {
        return (int) (Math.random()*150);
    }
}
