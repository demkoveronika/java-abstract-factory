public class PlasticFactory implements FacadeFactory {

    // Ціна за 1 м² суцільного пластикового фасаду
    private static final double SOLID_PRICE = 1700;

    // Ціна за 1 м² пластикового фасаду-вітрини
    private static final double GLASS_PRICE = 2100;

    // Створення суцільного пластикового фасаду
    @Override
    public Facade createSolidFacade(double area) {
        return new SolidFacade(area, "Пластик", SOLID_PRICE);
    }

    // Створення пластикового фасаду-вітрини
    @Override
    public Facade createGlassFacade(double area) {
        return new GlassFacade(area, "Пластик", GLASS_PRICE);
    }
}
