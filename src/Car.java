public class Car implements Vehicle {

    private String modelName;
    private int wheelsCount;

    public Car(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку у автомобиля " + modelName);
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель у автомобиля " + modelName);
    }

    // Геттеры и сеттеры для доступа к приватным полям
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }
}
//Что было изменено:
//Поля modelName и wheelsCount сделаны приватными для обеспечения инкапсуляции данных.
//Добавлен конструктор Car(String modelName, int wheelsCount) для инициализации модели и количества колес при создании объекта.
//Методы updateTyre() и checkEngine() теперь выводят информацию, специфичную для каждого автомобиля, используя modelName.
//Добавлены геттеры и сеттеры для доступа к полям modelName и wheelsCount, чтобы обеспечить контролируемый доступ к данным класса.
//Такой подход позволяет лучше управлять состоянием объекта Car и повышает его модульность и читаемость кода.