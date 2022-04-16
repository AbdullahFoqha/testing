package org.example;

import junit.framework.TestCase;

public class ArrayFlattenerTest extends TestCase {
    private ArrayFlattener arrayFlattener;

    public void setUp() throws Exception {
        super.setUp();
        arrayFlattener = new ArrayFlattener();
    }

    public void tearDown() throws Exception {
    }

    public void testSum() {
        int a = 9, b = 64;
        assertEquals(arrayFlattener.sum(9, 6), a + b);
    }
}