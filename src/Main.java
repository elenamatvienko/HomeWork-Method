import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int year = 2004;
        defineLeapYear(year);
    }

    public static void defineLeapYear(int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int clientOS = 1;
        int clientDeviceYear = 2018;
        determineDevice(clientOS, clientDeviceYear);
    }

    public static void determineDevice(int clientOS, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientOS <= 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS >= 1 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (clientOS <= 0 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для iOS  по ссылке");
        } else if (clientOS >= 1 && clientDeviceYear >= currentYear) {
            System.out.println("Установите версию приложения для  Android по ссылке");
        }
    }

    public static void task3() {
        System.out.println("Задача 3");
        int deliveryDistance = 95;
        printQuantityDays(deliveryDistance);
    }

    public static int calculateQuantityDays(int distance) {
        int deliveryDays = 0;

        if (distance <= 20) {
            deliveryDays = 1;
        } else if (distance <= 60) {
            deliveryDays = 2;
        } else if (distance <= 100) {
            deliveryDays = 3;
        } else {
            deliveryDays = 0;
        }
        return deliveryDays;
    }

    public static void printQuantityDays(int distance) {
        if (distance > 100) {
            System.out.println("Доставка не осуществляется.");
        } else {
            System.out.println("Доставка занимает " + calculateQuantityDays(distance) + " дня.");
        }
    }
}













