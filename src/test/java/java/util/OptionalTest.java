package java.util;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

public class OptionalTest {

    @Test
    public void verifyOfNullThrows(){
        try{
            Optional.of(null);
            fail("expected exception not thrown");
        } catch(IllegalArgumentException e){
            assertThat(e.getMessage(), containsString("value"));
        }

    }
}
