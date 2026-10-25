abstract class EnergySource 
{
    String sourceId;
    String sourceName;
    double energyGeneratedInKw;
    EnergySource(String sourceId, String sourceName, double energyGeneratedInKw) 
    {
        this.sourceId = sourceId;
        this.sourceName = sourceName;
        this.energyGeneratedInKw = energyGeneratedInKw;
    }
    abstract double calculateEfficiency();
    void displayDetails() {
        System.out.println("Source ID: " + sourceId);
        System.out.println("Source Name: " + sourceName);
        System.out.println("Energy Generated: " + energyGeneratedInKw + " kW");
        System.out.println("Efficiency: "+ calculateEfficiency());
    }
}
class SolarEnergy extends EnergySource 
{
    SolarEnergy(String sourceId, String sourceName, double energyGeneratedInKw) 
    {
        super(sourceId, sourceName, energyGeneratedInKw);
    }
    double calculateEfficiency() 
    {
        return (energyGeneratedInKw / 5000.0) * 100.0;
    }
}
class WindEnergy extends EnergySource 
{
    WindEnergy(String sourceId, String sourceName, double energyGeneratedInKw) {
        super(sourceId, sourceName, energyGeneratedInKw);
    }
    double calculateEfficiency() 
    {
        return (energyGeneratedInKw / 8000.0) * 100.0;
    }
}
class EnergySystem 
{
    public static void main(String[] args) 
    { 
        EnergySource solar = new SolarEnergy("SOL-101", "Rooftop Solar Array", 4250.0);
        EnergySource wind = new WindEnergy("WND-202", "Offshore Wind Turbine", 6800.0);
        System.out.println("Solar Energy Details");
        solar.displayDetails();
        System.out.println("Wind Energy Details");
        wind.displayDetails();
    }
}