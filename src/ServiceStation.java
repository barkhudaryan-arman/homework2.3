public class ServiceStation {
    public void check(Vehicle vehicle) {
        if (vehicle != null) {
            vehicle.service();
        } else {
            System.out.println("Не переданы данные о транспортном средстве для обслуживания.");
        }
    }
}
