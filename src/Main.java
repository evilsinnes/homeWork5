public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1, 2");
        char clientOS = 1;
        int clientDeviceYear = 2016;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
        if (clientDeviceYear > 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        else if (clientDeviceYear > 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        System.out.println("\n Задача 3");
        int year = 2021;
        if (year < 1584 && year % 100 == 0) {
            System.out.println(year + " год не является високосным");
        }
        else if (year % 4 == 0) {
            System.out.println(year + " год является високосным");
        }
        else {
            System.out.println(year + " год не является високосным");
        }
        System.out.println("\n Задача 4");
        int deliveryDistance = 110;
        int deliveryTime = 1;
        if (deliveryDistance < 20) {
            System.out.println("потребуется  дней : " + deliveryTime);
        }

        if (deliveryDistance >= 20 && deliveryDistance < 60) {
            deliveryTime += 1;
            System.out.println("потребуется  дней : " + deliveryTime);
        }

        if (deliveryDistance >= 60 && deliveryDistance < 100) {
            deliveryTime += 2;
            System.out.println("потребуется  дней : " + deliveryTime);
        }
        if (deliveryDistance >= 100) {
            System.out.println("Доставки нет");
        }

        System.out.println("\n Задача 5");
        int month = 1;
        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println("Этот месяц принадлежит к сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Этот месяц принадленжит к сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Этот месяц принадлежит к сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Эитот месяц принадлежит к сезону осень");
                break;
            default:
                System.out.println("не сущетвует больше месяцев");
        }


    }
}

