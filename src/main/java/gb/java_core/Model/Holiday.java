package gb.java_core.Model;

public enum Holiday {
    NO_HOLIDAY("Нет праздника"),
    NEW_YEAR("Новый год"),
    MARCH8_DAY("8 марта"),
    MEN_DAY("23 февраля"),
    ;

    private final String value;

    Holiday(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
