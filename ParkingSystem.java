interface ParkingCharge 
{
    int calculateCharge();
    void displayParkingdetails();
}
class VehicleParking 
{
    String vehicleNumber;
    String vehicleType;
    int parkingHours;
    public VehicleParking(String vehicleNumber, String vehicleType, int parkingHours) 
    {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.parkingHours = parkingHours;
    }
}
class TwoWheeler extends VehicleParking implements ParkingCharge 
{
    public TwoWheeler(String vehicleNumber, int parkingHours) 
    {
        super(vehicleNumber, "Two Wheeler", parkingHours);
    }
    public int calculateCharge() 
    {
        if (parkingHours <= 2) 
        {
            return parkingHours * 20;
        } 
        else 
        {
            return (2 * 20) + ((parkingHours - 2) * 10);
        }
    }
    public void displayParkingdetails() 
    {
        System.out.println(vehicleType + " Parking Details");
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Parking Hours  : " + parkingHours);
        System.out.println("Total Charge   : Rs " + calculateCharge());
    }
}
class FourWheeler extends VehicleParking implements ParkingCharge 
{
    public FourWheeler(String vehicleNumber, int parkingHours) 
    {
        super(vehicleNumber, "Four Wheeler", parkingHours);
    }
    public int calculateCharge() 
    {
        if (parkingHours <= 2) 
        {
            return parkingHours * 50;
        } 
        else 
        {
            return (2 * 50) + ((parkingHours - 2) * 30);
        }
    }
    public void displayParkingdetails() 
    {
        System.out.println(vehicleType + " Parking Details");
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Parking Hours  : " + parkingHours);
        System.out.println("Total Charge   : Rs " + calculateCharge());
    }
}
public class ParkingSystem 
{
    public static void main(String[] args) 
    {
        ParkingCharge bikeCharge = new TwoWheeler("KA-01-AB-1234", 5);
        ParkingCharge carCharge = new FourWheeler("MH-12-CD-5678", 3);
        bikeCharge.displayParkingdetails();
        carCharge.displayParkingdetails();
    }
}