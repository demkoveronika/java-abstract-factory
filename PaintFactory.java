public class PaintFactory implements FacadeFactory {

    // Ціна за 1 м² суцільного фарбованого фасаду
    private static final double SOLID_PRICE = 2000;

    // Ціна за 1 м² фарбованого фасаду-вітрини
    private static final double GLASS_PRICE = 2500;

    // Створення суцільного фарбованого фасаду
    @Override
    public Facade createSolidFacade(double area) {
        return new SolidFacade(area, "Фарба", SOLID_PRICE);
    }

    // Створення фарбованого фасаду-вітрини
    @Override
    public Facade createGlassFacade(double area) {
        return new GlassFacade(area, "Фарба", GLASS_PRICE);
    }
}
