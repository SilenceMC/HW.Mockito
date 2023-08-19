package ru.netology.geo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;

public class GeoServiceImplTest {

    @Test
    void byIpTest() {
        // Arrange
        GeoService geoService = new GeoServiceImpl();
        Location actual = geoService.byIp("172.27.105.11");
        // Act
        Location expected = new Location("Moscow", Country.RUSSIA, null, 0);
        // Assert
        Assertions.assertEquals(expected.getCity(), actual.getCity());
        Assertions.assertEquals(expected.getCountry(), actual.getCountry());
    }
}
