package transport.driver;

import transport.Car;

public class DriverB<T extends Car> extends Driver {

    private String licenseType;

    public DriverB(String passportPart, boolean hasDrivingLicense,
                   int experience, String licenseType) {
        super(passportPart, hasDrivingLicense, experience);
        if (licenseType == null) {
            throw new RuntimeException();}

        this.licenseType = licenseType;
        }
    }


        @Override
        public void startMove (Car transport){
            transport.start();
        }

        @Override
        public void stopMove (Car transport){
            transport.stop();
        }

        @Override
        public void refill (Car transport){
            System.out.println("Водила " + getPassportPart() + " заливает горючку в бак " + transport.getBrand());
        }
    }

