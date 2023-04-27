// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    private static void task5() {
        int mouthNumber = 10;
        switch (mouthNumber) {
            case 1:
                case 2:
            case 12:
                System.out.println("это месяц зимы");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("это месяц весны");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("это месяц лета");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("это месяц осени");
                break;
            default:
                System.out.println("такого месяца нет");

        }
    }

    private static void task4() {
        int km = 96;
        if (km <= 20) {
            System.out.println("Доставка осуществляется в течение суток");
            if (km > 20 && km < 60)
                System.out.println("доставка займет двое суток");
                if (km > 60 && km < 100) {
                    System.out.println("доставка займет трое суток");
                } else {
                    System.out.println("доставка не осуществляется");
                }
            }
        }


    private static void task3() {
        int year = 2020;
        if (year %100==0 && year %400==0) {
            System.out.println("год високосный");
        } else if (year %4==0 && year %100 > 0) {
            System.out.println("год високосный");}
        else if (year % 100 == 0) {
            System.out.println("год не високосный");}
        else {
            System.out.println("год не високосный");
        }




        }

    private static void task2() {
        int clientOS = 0;
        int year = 2011;
        switch (clientOS){
            case 1:
                System.out.println("установите версию андройд по ссылке ниже...");
                break;
            case 0:
                System.out.println("установить версию ios по ссылке ниже...");
                break;
        }
        if (year < 2015) {
            System.out.println("установите облегченную версию операционной системы");
        }
        else {
            System.out.println("установить новейшую версию");
        }
        }
    

    public static void task1 () {
       int clientOS = 0;
       if (clientOS == 0) {
           System.out.println("установите версию для ios по ссылке ...");
       } else {
           System.out.println("установите версию для андройд по ссылке ...");
    }
}}