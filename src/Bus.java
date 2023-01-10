public class Bus extends Transport implements Competing{


    public Bus(String brand, String model,
               double engineVolume,String bodyType,String MaxNumPassengers,
               String MaxWeightOnBoard,String cargoCategory ,String passengersCategory) {
        super(brand, model, engineVolume,bodyType,MaxNumPassengers,MaxWeightOnBoard);
    }

    @Override
    public void start() {
        System.out.println("Автобус\""+getBrand()+"\"(\""+getModel()+"\") начал движение");
    }

    @Override
    public void stop() {
        System.out.println("Автобус\""+getBrand()+"\"(\""+getModel()+"\") закончил движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Автобус прошёл ПИТ-СТОП");
    }

    @Override
    public int bestLoopTime() {
        return (int) (Math.random()*15);
    }

    @Override
    public int maxSpeed() {
        return (int) (Math.random()*100);
    }
}
