public class DriverB extends Driver<Car> {
    public DriverB(String passportPart,boolean hasDrivingLicense,int experience) {
        super(passportPart,hasDrivingLicense,experience);
    }

    @Override
    public void startMove(Car transport) {
        transport.start();
    }

    @Override
    public void stopMove(Car transport) {
        transport.stop();
    }

    @Override
    public void refill(Car transport) {
        System.out.println("Водила "+getPassportPart()+" заливает горючку в бак "+transport.getBrand());
    }
}
