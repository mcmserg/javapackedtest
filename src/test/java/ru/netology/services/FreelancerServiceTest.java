package ru.netology.services;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import ru.netology.services.FreelancerService;

public class FreelancerServiceTest {


    @Test
    public void testFirstExample() {
                FreelancerService service = new FreelancerService();


        int income = 10_000;    // 10 тысяч рублей
        int expenses = 3_000;   // 3 тысячи рублей
        int threshold = 20_000; // 20 тысяч рублей

        // Шаг 3: Ожидаемый результат
        int expected = 3;

        // Шаг 4: Вызываем метод calculate и получаем фактический результат
        int actual = service.calculate(income, expenses, threshold);
        //System.out.println("Ожидание  " + expected + ", итого  " + actual);

        // Шаг 5: Сравниваем ожидаемый и фактический результат
        Assertions.assertEquals(expected, actual);
    }

     @Test
     public void testSecondExample() {
        // Шаг 1: Создаём экземпляр сервиса
        FreelancerService service = new FreelancerService();

        // Шаг 2: Задаём параметры из первого примера
        int income = 100_000;    // 100 тысяч рублей
        int expenses = 60_000;   // 60 тысячи рублей
        int threshold = 150_000; // 150 тысяч рублей

        // Шаг 3: Ожидаемый результат
        int expected = 2;

        // Шаг 4: Вызываем метод calculate и получаем фактический результат
        int actual = service.calculate(income, expenses, threshold);
        //System.out.println("Ожидание  " + expected + ", итого  " + actual);

        // Шаг 5: Сравниваем ожидаемый и фактический результат
        Assertions.assertEquals(expected, actual);
    }

}
