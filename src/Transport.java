public abstract class Transport {

    private final String brand;
    private final String model;
    private final double engineVolume;
    private String bodyType;

    private String MaxNumPassengers;
    private String MaxWeightOnBoard;


    public Transport(String brand, String model, double engineVolume,
                     String bodyType, String MaxNumPassengers, String MaxWeightOnBoard, String cargoCategory, String passengersCategory) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.bodyType=bodyType;
        this.MaxNumPassengers=MaxNumPassengers;
        this.MaxWeightOnBoard=MaxWeightOnBoard;
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

}
