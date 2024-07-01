public class Truck extends AbstractVehicle {
    private String modelName;
    private int wheelsCount;

    public Truck(String modelName, int wheelsCount) {
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
        System.out.println("Truck tyres updated");
    }

    @Override
    public void service() {
        System.out.println("Обслуживаем " + getModelName());
        updateTyre();
        checkEngine();
        checkTrailer();
    }

    public void checkEngine() {
        System.out.println("Truck engine checked");
    }

    public void checkTrailer() {
        System.out.println("Truck trailer checked");
    }
}
