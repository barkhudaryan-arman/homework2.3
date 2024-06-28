public interface Vehicle {
    void updateTyre();
    void checkEngine();

    String getModelName();
    // Можно добавить другие методы, специфичные для разных типов транспортных средств
}
//Что было изменено:
//Создан интерфейс Vehicle, который объявляет методы updateTyre() и checkEngine(), необходимые для любого транспортного средства.
//Классы Car, Truck, Bicycle реализуют интерфейс Vehicle, реализуя свои специфичные методы updateTyre() и checkEngine().
//В классе ServiceStation метод check() теперь принимает объект типа Vehicle, что позволяет обслуживать любой тип транспортного средства без необходимости использовать разные параметры (Car, Bicycle, Truck).
//Добавлена проверка типа (instanceof) для выполнения специфичных действий для грузовиков в методе check(), что добавляет гибкость и расширяемость кода.
//Такой подход делает код более гибким, уменьшает зависимость от конкретных классов и обеспечивает соответствие принципам объектно-ориентированного программирования, таким как полиморфизм и инкапсуляция.