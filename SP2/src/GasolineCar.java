public class GasolineCar extends AFuelCar {
    private String fuelType;

    public GasolineCar(String fuelType, int kmPrLiter) {
        super(kmPrLiter);
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return this.fuelType;
    }

    public int getRegistrationFee() {
        int kmPrLitre = this.getKmPrLitre();

        if (kmPrLitre > 20 && kmPrLitre <= 50) {
            return 330;
        } else if (kmPrLitre > 15 && kmPrLitre <= 20) {
            return 1050;
        } else if (kmPrLitre > 10 && kmPrLitre <= 15) {
            return 2340;
        } else if (kmPrLitre > 5 && kmPrLitre <= 10) {
            return 5500;
        } else {
            return 10470;
        }
        
    }

}
