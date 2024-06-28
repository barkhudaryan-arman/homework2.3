public class Truck implements Vehicle {

    private String modelName;
    private int wheelsCount;

    public Truck(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку у грузовика " + modelName);
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель у грузовика " + modelName);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп у грузовика " + modelName);
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
//Поля modelName и wheelsCount были сделаны приватными для обеспечения инкапсуляции.
//Добавлен конструктор Truck(String modelName, int wheelsCount) для инициализации полей при создании объекта.
//Методы updateTyre(), checkEngine() и checkTrailer() теперь выводят информацию, специфичную для каждого грузовика, используя modelName.
//Добавлены геттеры и сеттеры для доступа к полям modelName и wheelsCount, чтобы обеспечить контролируемый доступ к данным класса.
//Эти изменения помогут улучшить структуру класса Truck и сделать его более согласованным с принципами объектно-ориентированного программирования.