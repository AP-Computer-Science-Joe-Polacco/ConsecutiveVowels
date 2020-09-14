

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class ConsecutiveVowelsTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ConsecutiveVowelsTest
{
    @Test
    public void testConsecutiveVowels(){
        assertEquals(3,ConsecutiveVowels.countConsecutiveVowels("copious"));
    }
}
