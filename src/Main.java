import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Запуск программы...");
        ArrayList<Cars> cars = new ArrayList<>();
        ArrayList<Person> person = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите 1, чтобы посмотреть все машины.");
            System.out.println("Введите 2, чтобы посмотреть всех владельцев.");
            System.out.println("Введите 3, чтобы посмотреть машину под номером.");
            System.out.println("Введите 4, чтобы посмотреть владельца под номером.");
            System.out.println("Введите 5, чтобы добавить машину.");
            System.out.println("Введите 6, чтобы добавить владельца.");
            System.out.println("Введите 7, чтобы привязать владельца к машине.");
            System.out.println("Введите 8, чтобы удалить машину.");
            System.out.println("Введите 9, чтобы удалить владельца.");
            System.out.println("Введите 10, чтобы выйти из программы.");
            String statement = scanner.next();

            switch (statement) {
                case "1":
                    int count = 0;
                    for (Cars place : cars) {
                        count++;
                        System.out.println("Номер машины: " + count);
                        place.Vivod();
                    }
                    System.out.println("Всего машин: " + count);
                    break;
                case "2":
                    int countP = 0;
                    for (Person place : person) {
                        countP++;
                        System.out.println("Номер владельца: " + countP);
                        place.Vivod();
                    }
                    System.out.println("Всего владельцев: " + countP);
                    break;
                case "3":
                    System.out.println("Введите номер машины для просмотра: ");
                    int index = scanner.nextInt();
                    if (index >= 1 && index <= cars.size()) {
                        Cars element = cars.get(index - 1);
                        element.Vivod();
                    } else {
                        System.out.println("Недопустимый номер машины.");
                    }
                    break;
                case "4":
                    System.out.println("Введите номер владельца для просмотра: ");
                    int indexP = scanner.nextInt();
                    if (indexP >= 1 && indexP <= person.size()) {
                        Person element = person.get(indexP - 1);
                        element.Vivod();
                    } else {
                        System.out.println("Недопустимый номер владельца.");
                    }
                    break;
                case "5":
                    String god, probeg, cena, marka, kuzov, korobka, dvigatel, privod, obyom;
                    System.out.println("Введите год машины: ");
                    god = scanner.next();
                    System.out.println("Введите пробег машины: ");
                    probeg = scanner.next();
                    System.out.println("Введите цену машины: ");
                    cena = scanner.next();
                    System.out.println("Введите марку машины: ");
                    marka = scanner.next();
                    System.out.println("Введите кузов машины:");
                    kuzov = scanner.next();
                    System.out.println("Введите коробку машины: ");
                    korobka = scanner.next();
                    System.out.println("Введите двигатель машины: ");
                    dvigatel = scanner.next();
                    System.out.println("Введите привод машины: ");
                    privod = scanner.next();
                    System.out.println("Введите объём машины: ");
                    obyom = scanner.next();
                    cars.add(new Cars(god, probeg, cena, marka, kuzov, korobka, dvigatel, privod, obyom));
                    System.out.println("Машина добавлена.");
                    break;
                case "6":
                    String name, familia, otchestvo, data, propiska, pol;
                    System.out.println("Введите имя владельца: ");
                    name = scanner.next();
                    System.out.println("Введите фамилию владельца: ");
                    familia = scanner.next();
                    System.out.println("Введите отчество владельца: ");
                    otchestvo = scanner.next();
                    System.out.println("Введите дату рождения владельца: ");
                    data = scanner.next();
                    System.out.println("Введите место прописки владельца: ");
                    propiska = scanner.next();
                    System.out.println("Введите пол владельца: ");
                    pol = scanner.next();
                    person.add(new Person(name, familia, otchestvo, data, propiska, pol));
                    System.out.println("Владелец добавлен.");
                    break;
                case "7":
                    System.out.println("Введите номер машины: ");
                    int carIndex = scanner.nextInt();
                    System.out.println("Введите номер владельца: ");
                    int ownerIndex = scanner.nextInt();

                    if (carIndex >= 1 && carIndex <= cars.size() && ownerIndex >= 1 && ownerIndex <= person.size()) {
                        Cars car = cars.get(carIndex - 1);
                        Person owner = person.get(ownerIndex - 1);
                        car.setOwner(owner);
                        System.out.println("Владелец привязан к машине.");
                    } else {
                        System.out.println("Недопустимый номер машины или владельца.");
                    }
                    break;
                case "8":
                    System.out.println("Введите номер машины для удаления: ");
                    int deleteIndex = scanner.nextInt();
                    if (deleteIndex >= 1 && deleteIndex <= cars.size()) {
                        cars.remove(deleteIndex - 1);
                        System.out.println("Машина удалена.");
                    } else {
                        System.out.println("Недопустимый номер машины.");
                    }
                    break;
                case "9":
                    System.out.println("Введите номер владельца для удаления: ");
                    int deleteIndexP = scanner.nextInt();
                    if (deleteIndexP >= 1 && deleteIndexP <= person.size()) {
                        person.remove(deleteIndexP - 1);
                        System.out.println("Владелец удален.");
                    } else {
                        System.out.println("Недопустимый номер владельца.");
                    }
                    break;
                case "10":
                    System.out.println("Выход из программы...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Неправильный ввод. Пожалуйста, выберите один из вариантов (1-10).");
                    break;
            }
        }
    }
}