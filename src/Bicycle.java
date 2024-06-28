public class Bicycle implements Vehicle {

    private String modelName;
    private int wheelsCount;

    public Bicycle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку у велосипеда " + modelName);
    }

    @Override
    public void checkEngine() {
        // Велосипед не имеет двигателя, поэтому метод может быть пустым или можно выбросить исключение
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
//Поля modelName и wheelsCount были изменены на private, чтобы обеспечить инкапсуляцию данных.
//Добавлен конструктор Bicycle(String modelName, int wheelsCount), который инициализирует объект при его создании.
//Добавлены геттеры и сеттеры для доступа к приватным полям modelName и wheelsCount.
