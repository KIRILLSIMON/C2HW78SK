package generic.transport;

public class DriverC extends Driver<Truck> {
    public DriverC(String passportPart, boolean hasDrivingLicense, int experience) {
        super(passportPart, hasDrivingLicense, experience);
    }

    @Override
    public void startMove(Truck transport) {
        transport.start();
    }

    @Override
    public void stopMove(Truck transport) {
        transport.stop();
    }

    @Override
    public void refill(Truck transport) {
        System.out.println("Водила "+getPassportPart()+" заливает горючку в бак "+transport.getBrand());
    }
}
