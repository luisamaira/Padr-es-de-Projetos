public class Main {
    public static void main(String[] args) {

        OldVehicleStorage oldVehicleStorage = new OldVehicleStorage();

        IVehicleStorage vehicleStorageAdapter = new VehicleStorageAdapter(oldVehicleStorage);

        Vehicle vehicle = new Vehicle("123ABC", "Toyota Camry", 2020);

        vehicleStorageAdapter.saveVehicleData(vehicle);
    }
}
