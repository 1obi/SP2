public abstract class AFuelCar extends ACar {

    private int kmPrLitre;

    public AFuelCar(int kmPrLitre){
        this.kmPrLitre = kmPrLitre;
    }

    abstract String getFuelType();

    public int getKmPrLitre(){
        return this.kmPrLitre;
    }

}
