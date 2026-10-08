import java.util.ArrayList;
import java.util.List;

public class Order {

    // Список фасадів у замовленні
    private List<Facade> facades = new ArrayList<>();

    // Додавання фасаду до замовлення
    public void addFacade(Facade facade) {

        // Перевіряємо, чи є вже фасади у замовленні
        if (!facades.isEmpty()) {

            // Порівнюємо матеріали фасадів
            if (!facades.get(0).getMaterial().equals(facade.getMaterial())) {
                System.out.println("Помилка: не можна додавати фасади різних матеріалів!");
                return;
            }
        }

        // Додаємо фасад до списку
        facades.add(facade);
    }

    // Розрахунок загальної вартості замовлення
    public double calculateTotalPrice() {
        double total = 0;

        // Проходимо по всіх фасадах у списку
        for (Facade facade : facades) {
            total += facade.calculatePrice();
        }

        return total;
    }

    // Виведення інформації про замовлення
    public void printOrder() {
        System.out.println("Інформація про замовлення:");

        // Виводимо кожен фасад
        for (Facade facade : facades) {
            System.out.println(
                facade.getType() +
                ", матеріал: " + facade.getMaterial() +
                ", площа: " + facade.getArea() + " м²" +
                ", вартість: " + facade.calculatePrice() + " грн"
            );
        }

        // Виводимо загальну вартість
        System.out.println("Загальна вартість: " + calculateTotalPrice() + " грн");
    }
}
