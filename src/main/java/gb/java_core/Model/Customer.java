package gb.java_core.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    private String fio;
    private String birth;
    private String phone;
    private Gender gender;
    private String greeting;

    @Override
    public String toString() {
        return  "ФИО: " + fio + ", " +
                "Дата рождения: " + birth + ", " +
                "Телефон: " + phone + ", " +
                "Пол: " + gender + ", " +
                "Поздравление: " + greeting + "\n";
    }
}
