
public class Hybrid implements ElectricInterface, GasolineInterface {

    private double gasMPG;
    private double MpgE;
    private double miles;
    private double gallons;
    private double kWh;
    private double cost;
    private double costkWh;

    private final double MPG_E = 33.7;

    public double calcGasMPG() {
        if (gallons==0.0){
            System.out.println("Invalid value for galllons!");
            return 0.0;
        }
        gasMPG = miles/gallons;
        return gasMPG;
    }
    public void setcostPerGallon(double cost){
        this.cost = cost;
    }
    public double getcostPerGallon(){
        return this.cost;
    }
    public void setcostPerKWh(double costkWh){
        this.costkWh=costkWh;

    }
    public double getcostperKWh(){
        return this.costkWh;
    }

    public double calcMPGe() {
        if (kWh==0){
            System.out.println("Invalid value for kWh!");
            return 0.0;
        }
        MpgE = (miles/kWh) * MPG_E;
        return  MpgE;
    }

    public void setMilesfromGas(double miles) {
        this.miles = miles;
    }
    public double getMiles(){
        return this.miles;
    }

    public void setGallonsfromGas(double gallons) {
        this.gallons = gallons;
    }
    public double getGallons(){
        return this.gallons;
    }

    public void setElectricMiles(double totalElectricMiles) {
        miles =  totalElectricMiles;
    }
    public double getEmiles(){
        return this.miles;
    }

    public void setTotalkWh(double totalkWh) {
        kWh = totalkWh;
    }
    public double getkWh(){
        return this.kWh;
    }
    public double calcCostForTripGasoline(){
        return this.cost*gallons;
    }
    public double calcCostForTripElectric(){
        return this.costkWh*kWh;
    }
    
   
}
