import org.example.src.singleton.Singleton;

import static org.junit.Assert.*;
import org.junit.Test;


public class SingletonTest {

    @Test
    public void testCallGetInstanceTwoTimes_andReturnOnlyOneInstance() {
        Singleton singleton_1 = Singleton.getInstance();
        Singleton singleton_2 = Singleton.getInstance();
        assertEquals(singleton_1, singleton_2);
    }
}
