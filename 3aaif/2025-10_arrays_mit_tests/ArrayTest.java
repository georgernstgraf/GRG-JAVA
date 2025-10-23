import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArrayTest {
    private int[][] arr_rev1 = { { 3, 2, 1 }, { 1, 2, 3 }, {}, { 6 } };
    private int[][] arr_rev2 = { { 999, -6, 12, 15, 18 }, { 18, 15, 12, -6, 999 }, {}, { 1038 } };

    private int[][] arr_min_max_1 = { { 999, -6, 12, 15, 18 }, { 999 }, { -6 } };
    private int[][] arr_min_max_2 = { { 13, 4, -3, 10, 2, 11, -5, 9 }, { 13 }, { -5 }, { 41 } };

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void sum() {
        assertEquals(arr_rev1[3][0], Array.arraySum(arr_rev1[0]));
        assertEquals(arr_rev2[3][0], Array.arraySum(arr_rev2[0]));
        assertEquals(arr_min_max_2[3][0], Array.arraySum(arr_min_max_2[0]));
    }

    @Test
    public void max() {
        assertEquals(arr_min_max_1[1][0], Array.arrayMax(arr_min_max_1[0]));
        assertEquals(arr_min_max_2[1][0], Array.arrayMax(arr_min_max_2[0]));
    }

    @Test
    public void min() {
        assertEquals(arr_min_max_1[2][0], Array.arrayMin(arr_min_max_1[0]));
        assertEquals(arr_min_max_2[2][0], Array.arrayMin(arr_min_max_2[0]));
    }

    @Test
    public void reversion() {
        assertArrayEquals(arr_rev1[1], Array.toReversed(arr_rev1[0]));
        assertArrayEquals(arr_rev1[0], Array.toReversed(arr_rev1[1]));
        assertArrayEquals(arr_rev2[1], Array.toReversed(arr_rev2[0]));
        assertArrayEquals(arr_rev2[0], Array.toReversed(arr_rev2[1]));
    }

    @Test
    public void closestToZero() {
        int[] a1 = { -9, -23, 26, -12, -7, 4, 21, -21, 1, -23 };
        int a1c = 1;
        int[] a2 = { -23, 15, 10, 25, -3, 15, 8, 14, 18, -23 };
        int a2c = -3;
        int[] a3 = { -2, -14, 26, -9, -24, -11, 20, 2, 18, 15 };
        int a3c = 2;
        assertEquals(a1c, Array.closestToZero(a1));
        assertEquals(a2c, Array.closestToZero(a2));
        assertEquals(a3c, Array.closestToZero(a3));
    }
}
