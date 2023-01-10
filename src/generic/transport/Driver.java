package generic.transport;

import exceptions.NoLicenseException;

public abstract class Driver{

private final String passportPart;
private final boolean hasLicense;
private final Integer experience;

    public Driver(String passportPart, boolean hasLicense, Integer experience) throws NoLicenseException {
        this.passportPart = validateString(name,"no name");
        this.hasLicense = validateLicense(hasLicense);
        this.experience =validateInteger(experience,1);
    }

    public String getPassportPart() {
        return passportPart;
    }

    public boolean getHasLicense() {
        return hasLicense;
    }

    public void setHasLicense(boolean hasLicense) {
        this.hasLicense = hasLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public abstract void startMove();
    public abstract void stopMove();
    public abstract void refill();

    public static boolean validateLicense(Boolean value) throws NoLicenseException{
        if (value==null||!value){
            throw new NoLicenseException("ЛИЦЕНЗИЯ-НЕ указана!");
        }
        return value;
    }
}
