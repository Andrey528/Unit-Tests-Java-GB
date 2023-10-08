package hw.second;

import hw.second.models.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MotorcycleTest {
    Motorcycle motorcycle;

    @BeforeEach
    public void initObject() {
        motorcycle = new Motorcycle("Kawasaki", "Ninja", 2022);
    }

    @Test
    void excpectedBeInstanceOfVehicle() {
        assertThat(motorcycle).isInstanceOf(Vehicle.class);
    }

    @Test
    void testDriveSpeedTest() {
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }

    @Test
    void parkSpeedTest() {
        motorcycle.testDrive();
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }

    @Test
    void getNumWheelsTest() {
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }
}