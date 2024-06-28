public class ServiceStation {

    public void check(Car car, Bicycle bicycle, Truck truck) {
        if (car != null) {
            System.out.println("Обслуживаем " + car.getModelName());
            car.updateTyre();
            car.checkEngine();
        } else if (bicycle != null) {
            System.out.println("Обслуживаем " + bicycle.getModelName());
            bicycle.updateTyre();
        } else if (truck != null) {
            System.out.println("Обслуживаем " + truck.getModelName());
            truck.updateTyre();
            truck.checkEngine();
            truck.checkTrailer();
        } else {
            System.out.println("Не переданы данные о транспортном средстве для обслуживания.");
        }
    }
}
