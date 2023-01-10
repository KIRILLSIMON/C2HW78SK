package generic.transport;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Transport {

    private final String brand;
    private final String model;
    private final double engineVolume;
    private String bodyType;

    private String MaxNumPassengers;
    private String MaxWeightOnBoard;
    private List<Driver> driverList = new ArrayList<>();
    private List<Mechanic<?>> mechanicList = new ArrayList<>();
    private List<Sponsor> sponsorList = new ArrayList<>();


    public Transport(String brand, String model, double engineVolume,
                     String bodyType, String MaxNumPassengers, String MaxWeightOnBoard, String cargoCategory, String passengersCategory) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.bodyType = bodyType;
        this.MaxNumPassengers = MaxNumPassengers;
        this.MaxWeightOnBoard = MaxWeightOnBoard;
    }

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public String getMaxNumPassengers() {
        return MaxNumPassengers;
    }

    public void setMaxNumPassengers(String maxNumPassengers) {
        MaxNumPassengers = maxNumPassengers;
    }

    public String getMaxWeightOnBoard() {
        return MaxWeightOnBoard;
    }

    public void setMaxWeightOnBoard(String maxWeightOnBoard) {
        MaxWeightOnBoard = maxWeightOnBoard;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public abstract void start();

    public abstract void stop();

    public abstract boolean passDiagnostic();

    public abstract void repair();

    public final <T extends Driver> void addDriver(T... drivers) {
        this.driverList.addAll(Arrays.asList(drivers));
    }

    public void addMechanic(Mechanic<?>... mechanics) {
        this.mechanicList.addAll(Arrays.asList(mechanics));
    }
    public void addSponsor(Sponsor...sponsors){
        this.sponsorList.addAll(Arrays.asList(sponsors));
    }

    public static int validateYear(Integer value) {
        return value == null || value <= 1900 ? 2000 : value;
    }

    public static String validateCarParameters(String value) {
        return value == null ? "не указано" : value;
    }

    public static String validateColor(String value) {
        return validateString(value, "белый");
    }
    public static String validateTransmission(String value){return validateString(value, "automat");}
    public static String validateCountry(String value){return validateString(value,"GB");}

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", engineVolume=" + engineVolume +
                ", bodyType='" + bodyType + '\'' +
                ", MaxNumPassengers='" + MaxNumPassengers + '\'' +
                ", MaxWeightOnBoard='" + MaxWeightOnBoard + '\'' +
                ", driverList=" + driverList +
                ", mechanicList=" + mechanicList +
                ", sponsorList=" + sponsorList +
                '}';
    }

    private static String validateString(String value, String белый) {
        return value;
    }
}
