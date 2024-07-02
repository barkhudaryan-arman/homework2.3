public class Bicycle extends AbstractVehicle {


    public Bicycle(String modelName, int wheelsCount) {
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
        System.out.println("Bicycle tyres updated");
    }

    @Override
    public void service() {
        System.out.println("Обслуживаем " + getModelName());
        updateTyre();
    }
}
