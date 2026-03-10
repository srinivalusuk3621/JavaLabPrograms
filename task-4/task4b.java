public class  task4b
{
    public static void main(String args[])
    {
        ElectricBike eBike = new ElectricBike();

        eBike.pedalType = "Standard";
        eBike.engineCapacity = 150;
        eBike.batteryCapacity = 500;

        eBike.showBicycleInfo();
        eBike.showMotorbikeInfo();
        eBike.showElectricBikeInfo();
    }
}
