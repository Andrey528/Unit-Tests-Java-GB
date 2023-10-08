package hw.second;

import hw.second.models.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class CarTest {
    Car car;

    @BeforeEach
    public void initObject() {
        car = new Car("Toyota", "Rav4", 2022);
    }

    @Test
    void excpectedBeInstanceOfVehicle() {
        assertThat(car).isInstanceOf(Vehicle.class);
    }

    @Test
    void testDriveSpeedTest() {
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    @Test
    void parkSpeedTest() {
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    @Test
    void getNumWheelsTest() {
        assertThat(car.getNumWheels()).isEqualTo(4);
    }
}