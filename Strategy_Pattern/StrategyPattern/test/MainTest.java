import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void TruckTest() {
        String transportationSelect = "Truck";
        assertEquals("Truck", transportationSelect);
    }

    @Test
    void PlaneTest() {
        String transportationSelect = "Plane";
        assertEquals("Plane", transportationSelect);
    }

    @Test
    void BoatTest() {
        String transportationSelect = "Boat";
        assertEquals("Boat", transportationSelect);
    }
}
