package transport.driver;

import transport.Transport;

public abstract class Driver<T extends Transport> {

private final String passportPart;
private boolean hasDrivingLicense;
private int experience;

    public Driver(String passportPart, boolean hasDrivingLicense, int experience) {
        this.passportPart = passportPart;
        this.hasDrivingLicense = hasDrivingLicense;
        this.experience = experience;
    }

    public String getPassportPart() {
        return passportPart;
    }

    public boolean isHasDrivingLicense() {
        return hasDrivingLicense;
    }

    public void setHasDrivingLicense(boolean hasDrivingLicense) {
        this.hasDrivingLicense = hasDrivingLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public abstract void startMove(T transport);
    public abstract void stopMove(T transport);
    public abstract void refill(T transport);

    public void printInfo(T transport){
        System.out.println("Шоферюга "+passportPart+" РУЛЯЕТ машину "+transport.getBrand() +" и участвует в заезде");
    }
}
