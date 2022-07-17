package ru.netology.sqr;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {
    @ParameterizedTest
    @CsvSource(value = {"200, 300, 3", "400, 400, 1", "100, 200, 5", "300, 300, 0"})
    void calculate(int min, int max, int expected) {
        SQRService service = new SQRService();

        int actual = service.calculate(min, max);
        assertEquals(expected, actual);
    }
}