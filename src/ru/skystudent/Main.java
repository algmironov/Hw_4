package ru.skystudent;

public class Main {

    public static void main(String[] args) {

    //Задание 1
    for (int n = 1; n <= 10; n++) {
        System.out.print(n + " ");
    }
        System.out.println("\n");
    for (int n = 10; n >= 1; n--) {
        System.out.print(n + " ");
    }
        System.out.println("\n");

    //Задание 2


    for (int firstFriday = 5; firstFriday <= 31; firstFriday += 7) {
        System.out.println("Сегодня пятница, " + firstFriday + "-е число. Необходимо подготовить отчет.");
    }

        System.out.println("\n");

    //Задание 3


    int thisYear = 2021;
    int startRangeYear = thisYear - 200;
    int endRangeYear = thisYear + 200;
    int cometAppearYear = 0;
    int cometAppearIntervalYears = 79;
    while (cometAppearYear <= endRangeYear) {
        if (cometAppearYear > thisYear) {
            System.out.println(cometAppearYear);
            break;
        }else if (cometAppearYear >= startRangeYear) {
            System.out.println(cometAppearYear);
            cometAppearYear += cometAppearIntervalYears;
        }else if (cometAppearYear < startRangeYear) {
             cometAppearYear += cometAppearIntervalYears;
         } else break;
    }

    //Задание 4



    }
}
