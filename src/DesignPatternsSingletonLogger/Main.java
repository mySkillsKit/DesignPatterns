package DesignPatternsSingletonLogger;

import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            new Thread(() -> Logger.getInstance().log("new Thead " + Thread.currentThread().getName())).start();
        }

        Logger logger = Logger.getInstance();
        logger.log("Запускаем программу!");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.print("Введите размер списка: ");
        int length = scan.nextInt();
        System.out.print("Введите верхнюю границу для значений: ");
        int max = scan.nextInt();
        logger.log("Создаём и наполняем список");
        List<Integer> list = new Random().ints(length, 1, max)
                .boxed()
                .toList();
        System.out.println("Вот случайный список: " + list);
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");
        int threshold = scan.nextInt();
        Filter filter = new Filter(threshold);
        logger.log("Выводим результат на экран " +
                "\n Отфильтрованный список: " + filter.filterOut(list));
        logger.log("Завершаем программу");
    }
}
