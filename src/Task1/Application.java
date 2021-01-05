package Task1;

import java.lang.invoke.WrongMethodTypeException;
import java.util.Scanner;

public class Application {

    enum Seasons {

        WINTER, SPRING, SUMMER, AUTUMN;

    }

    enum Months {

        JANUARY(31, Seasons.WINTER),
        FEBRUARY(28, Seasons.WINTER),
        MARCH(31, Seasons.SPRING),
        APRIL(30, Seasons.SPRING),
        MAY(31, Seasons.SPRING),
        JUNE(30, Seasons.SUMMER),
        JULY(31, Seasons.SUMMER),
        AUGUST(31, Seasons.SUMMER),
        SEPTEMBER(30, Seasons.AUTUMN),
        OCTOBER(31, Seasons.AUTUMN),
        NOVEMBER(30, Seasons.AUTUMN),
        DECEMBER(31, Seasons.WINTER);

        private int days;
        Seasons season;

        Months(int d, Seasons season) {
            this.days = d;
            this.season = season;
        }

        public int getDays() {
            return days;
        }

        public Seasons getSeason() {
            return season;
        }

    }

    static void menu() {
        System.out.println("натисність 1 щоб Перевірити чи є такий місяць");
        System.out.println("натисність 2 щоб Вивести всі місяці з такою ж порою року");
        System.out.println("натисність 3 щоб Вивести всі місяці які мають таку саму кількість днів");
        System.out.println("натисність 4 щоб  Вивести на екран всі місяці які мають меншу кількість днів");
        System.out.println("натисність 5 щоб Вивести на екран всі місяці які мають більшу кількість днів");
        System.out.println("натисність 6 щоб Вивести на екран наступну пору року");
        System.out.println("натисність 7 щоб Вивести на екран попередню пору року");
        System.out.println("натисність 8 щоб ВВивести на екран всі місяці які мають парну кількість днів");
        System.out.println("натисність 9 щоб Вивести на екран всі місяці які мають непарну кількість днів");
        System.out.println("натисність 0 щоб Вивести на екран чи введений з консолі місяць має парну кількість днів");

    }

    public static void main(String[] args) throws WrongMethodTypeException, WrongInputConsoleParametersException {

        Months[] masMonths = Months.values();
        Seasons[] masSeasons = Seasons.values();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            menu();

            switch (scanner.next()) {

                case "1": {
                    System.out.println("Введіть місяць");
                    scanner = new Scanner(System.in);
                    String month = scanner.next().toUpperCase();

                    boolean flag = false;

                    for (Months m : masMonths) {
                        if (m.name().equals(month)) {
                            System.out.println("Такий місяць існує");
                            flag = true;
                        }

                    }

                    if (!flag) {
                        try{throw  new WrongInputConsoleParametersException();}
                        catch (WrongInputConsoleParametersException ex)
                        {
                            System.out.println("");
                        }

                    }

                    break;
                }

                case "2": {
                    System.out.println("Введіть пору року");
                    scanner = new Scanner(System.in);
                    String season = scanner.next().toUpperCase();

                    boolean flag = false;

                    for (Months m : masMonths) {
                        if (m.getSeason().name().equals(season)) {
                            flag = true;
                        }

                    }

                    if (flag) {
                        Seasons seasonsValue = Seasons.valueOf(season);
                        for (Months m2 : masMonths) {
                            if (m2.getSeason().toString().equalsIgnoreCase(season)) {
                                System.out.println(m2);
                            }
                        }

                    }

                    if (!flag) {
                        try{throw  new WrongInputConsoleParametersException();}
                        catch (WrongInputConsoleParametersException ex)
                        {
                            System.out.println("");
                        }
                    }

                    break;
                }

                case "3": {
                    System.out.println("Введіть кількість днів");

                    scanner = new Scanner(System.in);
                    int days;
                    days = scanner.nextInt();




                    boolean flag = false;

                    for (Months m : masMonths) {
                        if (m.getDays() == days) {
                            System.out.println(m.name());
                            flag = true;
                        }

                    }

                    if (!flag) {
                        try{throw  new WrongInputConsoleParametersException();}
                        catch (WrongInputConsoleParametersException ex)
                        {
                            System.out.println("");
                        }
                    }

                    break;
                }

                case "4": {
                    System.out.println("Введіть кількість днів");
                    scanner = new Scanner(System.in);
                    int days = scanner.nextInt();

                    boolean flag = false;

                    for (Months m : masMonths) {
                        if (m.getDays() < days) {
                            System.out.println(m.name());
                            flag = true;
                        }

                    }

                    if (!flag) {
                        try{throw  new WrongInputConsoleParametersException();}
                        catch (WrongInputConsoleParametersException ex)
                        {
                            System.out.println("");
                        }
                    }

                    break;
                }

                case "5": {
                    System.out.println("Введіть кількість днів");
                    scanner = new Scanner(System.in);
                    int days = scanner.nextInt();

                    boolean flag = false;

                    for (Months m : masMonths) {
                        if (m.getDays() > days) {
                            System.out.println(m.name());
                            flag = true;
                        }

                    }

                    if (!flag) {
                        try{throw  new WrongInputConsoleParametersException();}
                        catch (WrongInputConsoleParametersException ex)
                        {
                            System.out.println("");
                        }
                    }

                    break;
                }

                case "6": {
                    System.out.println("Введіть пору року");
                    scanner = new Scanner(System.in);
                    String season = scanner.next().toUpperCase();

                    boolean flag = false;

                    for (Seasons s : masSeasons) {
                        if (s.name().equals(season)) {
                            flag = true;
                        }
                    }

                    if (flag) {
                        System.out.println("Наступна пора року ");
                        Seasons seasonsValue = Seasons.valueOf(season);
                        int ordinal = seasonsValue.ordinal();
                        if (ordinal == (masSeasons.length - 1)) {
                            ordinal = 0;
                            System.out.println(masSeasons[ordinal]);
                        } else {
                            System.out.println(masSeasons[ordinal + 1]);
                        }

                    }

                    if (!flag) {
                        try{throw  new WrongInputConsoleParametersException();}
                        catch (WrongInputConsoleParametersException ex)
                        {
                            System.out.println("");
                        }
                    }

                    break;
                }

                case "7": {
                    System.out.println("Введіть пору року");
                    scanner = new Scanner(System.in);
                    String season = scanner.next().toUpperCase();

                    boolean flag = false;

                    for (Seasons s : masSeasons) {
                        if (s.name().equals(season)) {
                            flag = true;
                        }
                    }

                    if (flag) {
                        System.out.println("Попередня пора року ");
                        Seasons seasonsValue7 = Seasons.valueOf(season);
                        int ordinal = seasonsValue7.ordinal();
                        if (ordinal == 0) {
                            ordinal = (masSeasons.length - 1);
                            System.out.println(masSeasons[ordinal]);
                        } else {
                            System.out.println(masSeasons[ordinal - 1]);
                        }

                    }

                    if (!flag) {
                        try{throw  new WrongInputConsoleParametersException();}
                        catch (WrongInputConsoleParametersException ex)
                        {
                            System.out.println("");
                        }
                    }

                    break;
                }

                case "8": {
                    System.out.println("парна кількість днів: ");
                    // scanner = new Scanner(System.in);

                    boolean flag = false;

                    for (Months m : masMonths) {
                        if (m.getDays() % 2 == 0) {
                            System.out.println(m.name());
                            flag = true;
                        }

                    }

                    break;
                }

                case "9": {
                    System.out.println("Непарна кількість днів");
                    // scanner = new Scanner(System.in);

                    boolean flag = false;

                    for (Months m : masMonths) {
                        if (m.getDays() % 2 != 0) {
                            System.out.println(m.name());
                            flag = true;
                        }
                    }

                    break;
                }

                case "10": {
                    System.out.println("Введіть місяць");
                    scanner = new Scanner(System.in);
                    String month = scanner.next().toUpperCase();

                    boolean flag = false;

                    for (Months m : masMonths) {
                        if (m.name().equals(month)) {
                            flag = true;
                        }

                    }

                    if (flag) {
                        for (Months m : masMonths) {
                            if (m.name().equals(month)) {
                                if (m.getDays() % 2 == 0) {
                                    System.out.println("Місяць має парну кількість днів");
                                } else {
                                    System.out.println("Місяць має непарну кількість днів");
                                }
                            }
                        }

                    }

                    if (!flag) {
                        try{throw  new WrongInputConsoleParametersException();}
                        catch (WrongInputConsoleParametersException ex)
                        {
                            System.out.println("");
                        }
                    }

                    break;
                }

            }

        }

    }


}