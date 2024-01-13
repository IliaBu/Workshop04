package gb.java_core.Model;

import java.util.ArrayList;
import java.util.List;

public class CustomerData {
    static List<Customer> customer = new ArrayList<>();

    private static void addCustomer(String fio, String birth, String phone, Gender gender) {
        customer.add(new Customer(fio, birth, phone, gender, null));
    }

    public static List<Customer> CustomerList() {
        addCustomer("Иванов Иван Иванович", "10.05.1987",  "89787412589", Gender.male);
        addCustomer("Иванова Ольга Николаевна", "20.06.1999", "89142562358", Gender.female);
        addCustomer("Малых Сергей Олегович", "10.08.2000", "89451245632", Gender.male);
        addCustomer("Кузьминых Наталья Николаевна", "30.02.1988", "89222111333", Gender.female);
        addCustomer("Рыбак Андрей Владимирович", "10.06.1977", "89555222444", Gender.male );
        addCustomer("Тимофеев Илья Сергеевич", "02.08.1976", "89222111333", Gender.male);
        addCustomer("Тимофеева Анна Владимировна", "01.01.1970", "89555222444", Gender.female);
        addCustomer("Малых Степан Олегович", "31.12.1978", "89748526525", Gender.male);
        return customer;
    }
}
