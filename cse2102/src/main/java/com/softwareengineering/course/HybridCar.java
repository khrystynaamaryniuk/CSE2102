

public class HybridCar {

    public static void main(String[] args) {
        Hybrid aHybrid = new Hybrid();
        double gallons = 15.0;
        double miles = 300;
        aHybrid.setGallonsfromGas(gallons);
        aHybrid.setMilesfromGas(miles);
        aHybrid.setElectricMiles(miles);
        aHybrid.setTotalkWh(70.0);
        double MPG = aHybrid.calcGasMPG();
        System.out.println(MPG);
        double MPGe = aHybrid.calcMPGe();
        System.out.println(MPGe);
        double average = (MPG+MPGe)/2.0;
        System.out.println(average);
    }

}