import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int year = 2021;
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
        int currentYear = LocalDate.now().getYear();
        int clientOS = 1;
        int clientDeviceYear = 2018;
        determineDevice(clientOS, clientDeviceYear, currentYear);
    }

    public static void determineDevice(int clientOS, int clientDeviceYear, int currentYear) {

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
        determineQuantityDays(deliveryDistance);
    }

    public static void determineQuantityDays(int deliveryDistance) {
        if (deliveryDistance < 20) {
            System.out.println("Доставка занимает один день.");
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            System.out.println("Доставка занимает два дня.");
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            System.out.println("Доставка занимает три дня.");
        }
    }
}





