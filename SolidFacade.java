public class SolidFacade extends Facade {

    // Ціна одного квадратного метра фасаду
    private double pricePerSquareMeter;

    // Конструктор суцільного фасаду
    public SolidFacade(double area, String material, double pricePerSquareMeter) {
        super(area, material);
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    // Метод для розрахунку вартості фасаду
    @Override
    public double calculatePrice() {
        return getArea() * pricePerSquareMeter;
    }

    // Метод для отримання типу фасаду
    @Override
    public String getType() {
        return "Суцільний фасад";
    }
}
