public class Car extends AbstractVehicle {


    public Car(String modelName, int wheelsCount) {
        super(modelName,wheelsCount);
    }

    @Override
    public String getModelName() {
        return modelName;
    }

    @Override
    public int getWheelsCount() {
        return wheelsCount;
    }

    @Override
    public void updateTyre() {
        System.out.println("Car tyres updated");
    }

    @Override
    public void service() {
        System.out.println("Обслуживаем " + getModelName());
        updateTyre();
        checkEngine();
    }

    public void checkEngine() {
        System.out.println("Car engine checked");
    }
}
