package org.example.test15;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SoNguyenTest {
    private SoNguyen soNguyen;
    @BeforeEach
    void setUp() {
        soNguyen = new SoNguyen();
    }
    @Test
    void arrSum() {
        assertEquals(0,soNguyen.arrSum(new int[]{}));
    }
    @Test
    void arrSum2() {
        assertEquals(3,soNguyen.arrSum(new int[]{1,2}));
    }
    @Test
    void arrSum3() {
        assertEquals(55,soNguyen.arrSum(new int[]{1,2,3,4,5,6,7,8,9,10}));
    }
    @Test
    void arrSum4() {
        assertEquals(-1,soNguyen.arrSum(new int[]{1,-2}));
    }
    @Test
    void arrSum5() {
        assertEquals(1,soNguyen.arrSum(new int[]{1,0}));
    }
}