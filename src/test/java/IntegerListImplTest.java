import org.example.IntegerList;
import org.example.IntegerListImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IntegerListImplTest {
    private IntegerList integerList;

    @BeforeEach
    void setUp() {
        integerList = new IntegerListImpl();
    }

    @Test
    void testAddAndGetSize() {
        integerList.add(10);
        integerList.add(20);
        assertEquals(2, integerList.size());
    }

    @Test
    void testAddAndGet() {
        integerList.add(10);
        integerList.add(20);
        assertEquals(10, integerList.get(0));
        assertEquals(20, integerList.get(1));
    }

    @Test
    void testAddAtSpecificIndex() {
        integerList.add(10);
        integerList.add(30);
        integerList.add(1, 20);
        assertEquals(3, integerList.size());
        assertEquals(10, integerList.get(0));
        assertEquals(20, integerList.get(1));
        assertEquals(30, integerList.get(2));
    }

    @Test
    void testSet() {
        integerList.add(10);
        integerList.add(20);
        integerList.set(1, 30);
        assertEquals(30, integerList.get(1));
    }

    @Test
    void testRemoveByValue() {
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        integerList.remove(Integer.valueOf(20));
        assertEquals(2, integerList.size());
        assertEquals(10, integerList.get(0));
        assertEquals(30, integerList.get(1));
    }

    @Test
    void testRemoveByIndex() {
        integerList.add(10);
        integerList.add(20);
        integerList.add(30);
        integerList.remove(1);
        assertEquals(2, integerList.size());
        assertEquals(10, integerList.get(0));
        assertEquals(30, integerList.get(1));
    }

    @Test
    void testContains() {
        integerList.add(10);
        integerList.add(20);
        assertTrue(integerList.contains(10) > -1);
        assertFalse(integerList.contains(30) > -1);
    }

    @Test
    void testIndexOf() {
        integerList.add(10);
        integerList.add(20);
        assertEquals(0, integerList.indexOf(10));
        assertEquals(1, integerList.indexOf(20));
        assertEquals(-1, integerList.indexOf(30));
    }

    @Test
    void testLastIndexOf() {
        integerList.add(10);
        integerList.add(20);
        integerList.add(10);
        assertEquals(2, integerList.lastIndexOf(10));
        assertEquals(1, integerList.lastIndexOf(20));
        assertEquals(-1, integerList.lastIndexOf(30));
    }

    @Test
    void testEquals() {
        IntegerList otherList = new IntegerListImpl();
        otherList.add(10);
        otherList.add(20);
        integerList.add(10);
        integerList.add(20);
        assertTrue(integerList.equals(otherList));
    }

    @Test
    void testClear() {
        integerList.add(10);
        integerList.add(20);
        integerList.clear();
        assertEquals(0, integerList.size());
        assertTrue(integerList.isEmpty());
    }

    @Test
    void testToArray() {
        integerList.add(10);
        integerList.add(20);
        Integer[] array = integerList.toArray();
        assertEquals(2, array.length);
        assertEquals(10, array[0]);
        assertEquals(20, array[1]);
    }
}