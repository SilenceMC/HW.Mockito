package ru.netology.i18n;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;

public class LocalizationServiceImplTest {
    @Test
    void localTest() {
        // arrange
        LocalizationService localizationService = new LocalizationServiceImpl();
        String actual = localizationService.locale(Country.RUSSIA);
        // act
        String expected = "Добро пожаловать";
        // assert
        Assertions.assertEquals(actual, expected);
    }
}
