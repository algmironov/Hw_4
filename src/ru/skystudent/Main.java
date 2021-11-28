package ru.skystudent;

import java.util.ArrayList;
import java.util.List;

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
         }
    }
        System.out.println("\n");

    //Задание 4
    String ping = "ping";
    String pong = "pong";
    for (int counter = 1; counter <= 30; counter += 1) {
        if (counter % 3 == 0 && counter % 5 == 0){
            System.out.println(counter + ": " + ping + " " + pong);
        }else if (counter % 3 == 0) {
            System.out.println(counter + ": " + ping);
        } else if (counter % 5 == 0) {
            System.out.println(counter + ": " + pong);
        }
    }
        System.out.println("\n");

    //Задание 5

    int fibNum1 = 0;
    int fibNum2 = 1;
    int fibNextNum = fibNum1 + fibNum2;
    List fiboList = new ArrayList();
    fiboList.add(fibNum1);
    fiboList.add(fibNum2);
    fiboList.add(fibNextNum);
    int fiboListSize = fiboList.size();
    while (fiboListSize <= 9) {
        fibNextNum = fibNextNum + fibNum2;
        fiboList.add(fibNextNum);
        fibNum2 = fibNextNum - fibNum2;
        fiboListSize++;
    }
        System.out.println(fiboList.toString().substring(1, fiboList.toString().length()-1));
        System.out.println("\n");


    //Задание 6

    int clientAge = 19;
    int clientSalary = 58_000;
    float creditLimit = 0f;
    float creditLimitCoeff = 0f;
    if (clientAge <= 23) {
        creditLimit += clientSalary * 2;
    }else {
        creditLimit += clientSalary * 3;
    }
    if (clientSalary >= 50_000 && clientSalary < 80_000) {
        creditLimitCoeff += 1.2f ;
    }else if (clientSalary >= 80_000) {
        creditLimitCoeff += 1.5f;
    }
    float creditCardLimit = creditLimit * creditLimitCoeff;
        System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + creditCardLimit + " рублей");
        System.out.println("\n");


        // Задание 7
        float basePercent = 10f;
        int creditLenghtMonth = 12;
        int clientsAge = 25;
        float clientsSalary = 60_000f;
        int wantedSum = 330_000;
        float maxMonthyPaymentPercent = 50f;
        float under23IncreasementPercent = 1f;
        float under30IncreasementPercent = 0.5f;
        float forSalaryDecreasementPercent = 0.7f;
        if (clientsAge < 23) {
            basePercent = basePercent + under23IncreasementPercent;
        } else if (clientsAge < 30 && clientsAge > 23) {
            basePercent = basePercent + under30IncreasementPercent;
        }
        if (clientsSalary > 80_000) {
            basePercent = basePercent - forSalaryDecreasementPercent;
        }
        float monthlyPayment = ((wantedSum * basePercent)/ 100) / creditLenghtMonth;
        float maxPayment = clientsSalary * (maxMonthyPaymentPercent / 100);
        if (monthlyPayment > maxPayment) {
            System.out.println("Максимальный платеж при ЗП " + clientsSalary + " равен " + maxPayment + " рублей. Платеж по кредиту " + monthlyPayment + " рублей. Отказано");
        }else {
            System.out.println("Максимальный платеж при ЗП " + clientsSalary + " равен " + maxPayment + " рублей. Платеж по кредиту " + monthlyPayment + " рублей. Одобрено");
        }




    }
    }

