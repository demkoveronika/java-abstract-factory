public class GlassFacade extends Facade {

    // Ціна одного квадратного метра фасаду-вітрини
    private double pricePerSquareMeter;

    // Конструктор фасаду-вітрини
    public GlassFacade(double area, String material, double pricePerSquareMeter) {
        super(area, material);
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    // Метод для розрахунку вартості фасаду-вітрини
    @Override
    public double calculatePrice() {
        return getArea() * pricePerSquareMeter;
    }

    // Метод для отримання типу фасаду
    @Override
    public String getType() {
        return "Фасад-вітрина";
    }
}
