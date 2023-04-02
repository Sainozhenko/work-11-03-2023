package consultation_30_03_2023;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

class MainTest {
    private Main m ;
    @BeforeEach
    public void init(){
        m= new Main();
    }

    @Test
    public void empty(){
        List<Integer> expected = Arrays.asList();
        List<Integer> actual = Arrays.asList();
        assertEquals(expected,m.numbers(actual,4));
    }
    @Test
    public void one_element(){
        List<Integer> expected = Arrays.asList(1);
        List<Integer> actual = Arrays.asList(1);
        assertEquals(expected,m.numbers(actual,4));
    }
    @Test
    public void nothing_elements(){
        List<Integer> expected = Arrays.asList();
        List<Integer> actual = Arrays.asList(3,2,1,4);
        assertEquals(expected,m.numbers(actual,0));
    }
    @Test
    public void nothing_elementsThen(){
        List<Integer> expected = Arrays.asList(1,5,3,2);
        List<Integer> actual = Arrays.asList(1,5,3,9,2);
        assertEquals(expected,m.numbers(actual,8));
    }

    @Test
    public void testFindMinOrMaxWithEmptyList() {
        List<String> strings = Arrays.asList();
        assertNull(null);
    }

    @Test
    public void testFindMinOrMaxWithNonEmptyList() {
        List<String> strings = Arrays.asList("aaa", "bbbbbbb", "fddfdfdfdf");
        String result = m.findMinOrMax(strings, 0);
        assertEquals(result,"aaa");
    }
    @Test
    public void testFindMinOrMaxWithAllLengthsList() {
        List<String> strings = Arrays.asList("aaa", "bbb", "ccc");
        String result = m.findMinOrMax(strings, 0);
        assertEquals(result,"aaa");
    }

}