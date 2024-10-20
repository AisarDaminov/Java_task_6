package ru.netology.javamvn.Java_task_6.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class CalculateVacationMonthTest {

    @ParameterizedTest
//    Параметризированные тесты из java файла:
//    @CsvSource({
//            "10000, 3000, 20000, 3",
//            "100000, 60000, 150000, 2",
//            "1000000, 600000, 150000, 6",
//    })

//    Параметризированные тесты из .csv файла:
    @CsvFileSource(files = "src/test/resources/data.csv")
    public void testName(int income, int expenses, int threshold, int expected) {
        VacationMonthCalculator service = new VacationMonthCalculator();
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}
