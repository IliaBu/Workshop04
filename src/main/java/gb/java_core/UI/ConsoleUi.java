package gb.java_core.UI;

import gb.java_core.Functions;

import java.util.Scanner;

public class ConsoleUi {
    public static final int SIZE_LINE = 110;
    public static final Scanner scanner = new Scanner(System.in,"Cp866");
    public void start() {
        clearConsole();
        printLineWithSymbol("=", SIZE_LINE, Colors.YELLOW);
        printCaption("Задачи 5-го семинара по Java-core", " ", Colors.GREEN);
        printLineWithSymbol("=", SIZE_LINE, Colors.YELLOW);
        printLineWithSymbol("-", SIZE_LINE, Colors.YELLOW);

        println("В класс покупателя добавить перечисление с гендерами, внедрить Lombok. \n" +
                        "Добавить в основную программу перечисление с праздниками нет праздника, Новый Год, 8 марта, 23 февраля, \n" +
                        "написать метод, принимающий массив покупателей, поздравляющий всех сотрудников с Новым Годом, \n" +
                        "женщин с 8 марта, а мужчин с 23 февраля, если сегодня соответствующий день \n", Colors.BLUE);
        Functions.main();
    }

    private void clearConsole() {
        System.out.print("\033[H\033[J");
    }

    private void printLineWithSymbol(String symbol, int sizeLine, Enum displayColor) {
        printResetln(displayColor + symbol.repeat(sizeLine) + Colors.RESET);
    }

    private void printCaption(String caption, String padSymb, Enum displayColor) {
        int spaceSize = (SIZE_LINE - caption.length()) / 2;
        String captionLine = padSymb.repeat(spaceSize) + caption + padSymb.repeat(spaceSize);
        printResetln(displayColor + captionLine + Colors.RESET);
    }

    public static void printResetln(String message) {
        System.out.println(message);
    }

    public static void println(String message, Enum displayColor) {
        System.out.println(displayColor + message + Colors.RESET);
    }

    public static void print(String message, Enum displayColor) {
        System.out.print(displayColor + message + Colors.RESET);
    }

}
