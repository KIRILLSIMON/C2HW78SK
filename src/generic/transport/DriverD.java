package generic.transport;

public class DriverD extends Driver<Bus> {
    public DriverD(String passportPart, boolean hasDrivingLicense, int experience) {
        super(passportPart, hasDrivingLicense, experience);
    }

    @Override
    public void startMove(Bus transport) {
        transport.start();
    }

    @Override
    public void stopMove(Bus transport) {
        transport.stop();
    }

    @Override
    public void refill(Bus transport) {
        System.out.println("ГЕНЕРАЛЬНЫЙ КАПИТАН АВдОПУСА "+getPassportPart()+" заливает горючку в бак "+transport.getBrand());
    }
}
