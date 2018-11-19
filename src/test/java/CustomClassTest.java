import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

/**
 * Created by mtumilowicz on 2018-11-19.
 */
public class CustomClassTest {
    
    @Test
    public void get_method_is_inherited_from_super_class() {
        assertThat(new CustomClass().get(), is("SuperClass"));
    }

}