package ru.netology.services;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
//import ru.netology.services.FreelancerService;

public class FreelancerServiceTest {


    @ParameterizedTest
//    @CsvSource({
//            "10000, 3000, 20000, 3",      // Первый пример из условия
//            "100000, 60000, 150000, 2",   // Второй пример из условия
//
//
//    })
    @CsvFileSource(files="src/test/resources/criteria.csv")
    public void testCalculateWithCSVSource(int income, int expenses, int threshold, int expected) {
                FreelancerService service = new FreelancerService();


        /*int income = 10_000;    // 10 тысяч рублей
        int expenses = 3_000;   // 3 тысячи рублей
        int threshold = 20_000; // 20 тысяч рублей

        // Шаг 3: Ожидаемый результат
        int expected = 3;*/

        // Шаг 4: Вызываем метод calculate и получаем фактический результат
        int actual = service.calculate(income, expenses, threshold);
        //System.out.println("Ожидание  " + expected + ", итого  " + actual);

        // Шаг 5: Сравниваем ожидаемый и фактический результат
        Assertions.assertEquals(expected, actual);
    }
}
