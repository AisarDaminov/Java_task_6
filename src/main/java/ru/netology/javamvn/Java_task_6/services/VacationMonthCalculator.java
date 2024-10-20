package ru.netology.javamvn.Java_task_6.services;

public class VacationMonthCalculator {
    public int calculate(int income, int expenses, int threshold) {
        int vacationMonthsQuantity = 0;
        int money = 0;
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                money = money - expenses;
                money = money / 3;
                vacationMonthsQuantity++;
            } else {
                money = money + income;
                money = money - expenses;
            }
        }
        return vacationMonthsQuantity;
    }
}
