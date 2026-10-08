public interface FacadeFactory {

    // Метод для створення суцільного фасаду
    Facade createSolidFacade(double area);

    // Метод для створення фасаду-вітрини
    Facade createGlassFacade(double area);
}
