import com.SuperStore.Staff.Person;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person unitTest;
    @BeforeEach
    void setUp() {
        unitTest = new Person("Philip");
    }

    @Test
    void toBeAbleTorReturnName(){
        String getName = unitTest.getName();
        assertEquals("Philip", getName);

    }
}