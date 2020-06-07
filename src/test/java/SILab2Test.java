import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {

    private final SILab2 lab = new SILab2();
    private List<String> users(String... el)
    {
        return new ArrayList<>(Arrays.asList(el));
    }

    @Test
    public void EveryStatement(){

        RuntimeException exception;

        //test1
        assertTrue(lab.function(new User("martina", "12345", "martina@gmail.com"), users("martina1", "dajana1")));
        //test2
        exception= assertThrows(RuntimeException.class, ()->lab.function(null,  users("martina1","dajana1","elena")));
        assertTrue(exception.getMessage().contains("The user argument is not initialized!"));
        //test3
        exception=assertThrows(RuntimeException.class, ()->lab.function(new User("martina1","12345","martina1@yahoo.com"), users("martina1","dajana1")));
        assertTrue(exception.getMessage().contains("User already exists!"));
        exception=assertThrows(RuntimeException.class, ()->lab.function(new User(null,"12345","martina1@yahoo.com"), users("martina1","dajana1")));
        assertTrue(exception.getMessage().contains("User already exists!"));
        //test4
        assertFalse(lab.function(new User("martina12","12345","martina@gmail"), users("martina1","dajana1")));
        assertFalse(lab.function(new User("martina12","12345","gmail.com"), users("martina1","dajana1")));
        assertFalse(lab.function(new User("martina12","12345","gmail"), users("martina1","dajana1")));
        //test5
        assertFalse(lab.function(new User("martina12","12345",null), users("martina1","dajana1","elena")));
    }
    @Test
    public void EveryPath(){

        RuntimeException exception;

        //A, B
        exception=assertThrows(RuntimeException.class, ()->lab.function(null,users("marija","elena3")));
        assertTrue(exception.getMessage().contains("The user argument is not initialized!"));
        //A, C, D
        exception=assertThrows(RuntimeException.class, ()->lab.function(new User("marija","12345","marija1@gmail.com"),users("marija","elena3")));
        assertTrue(exception.getMessage().contains("User already exists!"));
        // A, C, E, F
        assertFalse(lab.function(new User("dajana","12345",null), users("marija","dajana1","elena")));
        //A, C, E, G, (H, I, J, K, L, H), M, N
        assertTrue(lab.function(new User("elena8","12345","elena@gmail.com"),users("martina1","dajana1")));
        //A, C, E, G, (H, I, K, H), M, F
        assertFalse(lab.function(new User("martina11","12345","gmail.com"),users("martina1","marija")));
        assertFalse(lab.function(new User("martina11","12345","@gmail"),users("martina1","marija")));
        assertFalse(lab.function(new User("martina11","12345","gmail"),users("martina1","marija")));
    }
}
