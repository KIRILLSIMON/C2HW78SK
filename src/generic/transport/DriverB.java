package generic.transport;

import exceptions.NoLicenseException;

public class DriverB<T extends Car>extends Driver {

    private String licenseType;
    public DriverB(String passportPart,boolean hasLicense,int experience, String licenseType) throws NoLicenseException {
        super(passportPart,hasLicense,experience);
        if (licenseType==null||licenseType.equals("B")){
            throw new NoLicenseException();
        }
        this.licenseType=licenseType;
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
