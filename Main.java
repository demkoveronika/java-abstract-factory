import java.util.Scanner;
import java.util.Locale;

public class Main {

    // Головний метод програми
    public static void main(String[] args) {

        // Створюємо Scanner для введення даних
        Scanner scanner = new Scanner(System.in);

        // Встановлюємо формат чисел із десятковою крапкою
        scanner.useLocale(Locale.US);

        System.out.println("Калькулятор меблевих фасадів");

        // Пропонуємо користувачу вибрати матеріал
        System.out.println("Виберіть матеріал:");
        System.out.println("1 - Плівка");
        System.out.println("2 - Фарба");
        System.out.println("3 - Пластик");

        int materialChoice = scanner.nextInt();

        // Змінна для зберігання вибраної фабрики
        FacadeFactory factory;

        // Визначаємо фабрику за вибором користувача
        switch (materialChoice) {
            case 1:
                factory = new FilmFactory();
                break;
            case 2:
                factory = new PaintFactory();
                break;
            case 3:
                factory = new PlasticFactory();
                break;
            default:
                System.out.println("Неправильний вибір матеріалу!");
                scanner.close();
                return;
        }

        // Створюємо нове замовлення
        Order order = new Order();

        // Запитуємо кількість фасадів
        System.out.print("Введіть кількість фасадів: ");
        int count = scanner.nextInt();

        // Перевіряємо кількість
        if (count <= 0) {
            System.out.println("Кількість повинна бути більшою за 0!");
            scanner.close();
            return;
        }

        // Цикл для створення кожного фасаду
        for (int i = 0; i < count; i++) {

            System.out.println("\nФасад №" + (i + 1));

            // Вибираємо тип фасаду
            System.out.println("1 - Суцільний фасад");
            System.out.println("2 - Фасад-вітрина");
            int typeChoice = scanner.nextInt();

            // Перевіряємо тип фасаду
            if (typeChoice != 1 && typeChoice != 2) {
                System.out.println("Неправильний тип фасаду!");
                i--;
                continue;
            }

            // Вводимо площу фасаду
            System.out.print("Введіть площу в м²: ");
            double area = scanner.nextDouble();

            // Перевіряємо правильність площі
            if (area <= 0) {
                System.out.println("Площа повинна бути більшою за 0!");
                i--;
                continue;
            }

            // Створюємо фасад через вибрану фабрику
            Facade facade;

            if (typeChoice == 1) {
                facade = factory.createSolidFacade(area);
            } else {
                facade = factory.createGlassFacade(area);
            }

            // Додаємо фасад до замовлення
            order.addFacade(facade);
        }

        // Виводимо інформацію про замовлення
        System.out.println("\nРезультат замовлення:");
        order.printOrder();

        // Закриваємо Scanner
        scanner.close();
    }
}
