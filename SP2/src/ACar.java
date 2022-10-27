public abstract class ACar implements Car {

    private String registrationNumber;
    private String make;
    //The make of the car e.g. Audi
    private String model;
    //The model of the car e.g. A6
    private int numberOfDoors;


    public String getRegistrationNumber() {
        return this.registrationNumber;
    }


    public String getMake() {
        return this.make;
    }


    public String getModel() {
        return this.model;
    }

    public int getNumberOfDoors() {
        return this.numberOfDoors;
    }

}
