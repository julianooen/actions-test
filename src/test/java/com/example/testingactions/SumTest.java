package com.example.testingactions;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {

    @org.junit.jupiter.api.Test
    void execute() {
        Sum sum = new Sum();
        assertEquals(6.0, sum.execute(2.0, 3.0));
    }

}