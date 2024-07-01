public class Bicycle implements Vehicle {
    private String modelName;
    private int wheelsCount;

    public Bicycle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
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
