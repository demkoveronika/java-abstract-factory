public abstract class Facade {

    // Площа фасаду у квадратних метрах
    private double area;

    // Матеріал, з якого виготовлений фасад
    private String material;

    // Конструктор для створення фасаду
    public Facade(double area, String material) {
        this.area = area;
        this.material = material;
    }

    // Метод для отримання площі фасаду
    public double getArea() {
        return area;
    }

    // Метод для отримання матеріалу фасаду
    public String getMaterial() {
        return material;
    }

    // Абстрактний метод для розрахунку вартості
    public abstract double calculatePrice();

    // Абстрактний метод для отримання типу фасаду
    public abstract String getType();
}
