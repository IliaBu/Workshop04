package gb.java_core;

import gb.java_core.Model.Customer;
import gb.java_core.Model.CustomerData;
import gb.java_core.Model.Gender;
import gb.java_core.Model.Holiday;
import gb.java_core.UI.Colors;
import gb.java_core.UI.ConsoleUi;

import java.util.List;

public class Functions {

    public static void main() {
        List<Customer> customers = CustomerData.CustomerList();
        System.out.println("Список покупателей до поздравления: ");
        ConsoleUi.println(customers.toString().replace("[", "").replace("]", ""), Colors.YELLOW);

        ConsoleUi.print("Введите число, месяц через точку: ", Colors.BLUE);
        String dateMonth = ConsoleUi.scanner.next();
        celebrateHoliday(customers, dateMonth);

        System.out.println("Список покупателей после поздравления: ");
        ConsoleUi.println(customers.toString().replace("[", "").replace("]", ""), Colors.YELLOW);
    }

    public static void celebrateHoliday(List<Customer> customers, String today) {
        for (Customer customer : customers) {
            Holiday holiday = today.contains("01.01") ? Holiday.NEW_YEAR : today.contains("08.03") ? Holiday.MARCH8_DAY : today.contains("23.02") ? Holiday.MEN_DAY : Holiday.NO_HOLIDAY;
            if (holiday == Holiday.NEW_YEAR) {
                customer.setGreeting("С Новым Годом!");
            } else if (holiday == Holiday.MARCH8_DAY) {
                if (customer.getGender().equals(Gender.female)) {
                    customer.setGreeting("С 8 Марта!");
                }
            } else if (holiday == Holiday.MEN_DAY) {
                if (customer.getGender().equals(Gender.male)) {
                    customer.setGreeting("С 23 Февраля!");
                }
            }
            if (customer.getGreeting() == null) {
                customer.setGreeting("Нет праздника!");
            }
        }
    }

}
