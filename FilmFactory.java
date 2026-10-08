public class FilmFactory implements FacadeFactory {

    // Ціна за 1 м² суцільного плівкового фасаду
    private static final double SOLID_PRICE = 1200;

    // Ціна за 1 м² плівкового фасаду-вітрини
    private static final double GLASS_PRICE = 1500;

    // Створення суцільного плівкового фасаду
    @Override
    public Facade createSolidFacade(double area) {
        return new SolidFacade(area, "Плівка", SOLID_PRICE);
    }

    // Створення плівкового фасаду-вітрини
    @Override
    public Facade createGlassFacade(double area) {
        return new GlassFacade(area, "Плівка", GLASS_PRICE);
    }
}
