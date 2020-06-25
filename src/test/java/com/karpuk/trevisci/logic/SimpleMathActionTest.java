package com.karpuk.trevisci.logic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SimpleMathActionTest {
    private SimpleMathAction simpleMathAction;

    @BeforeEach
    public void initialize() {
        simpleMathAction = new SimpleMathAction();
    }

    @ParameterizedTest
    @CsvSource({
            "1, 2, 3",
            "-1, -5, -6",
            "1, -100, -99",
            "9999, -1111, 8888"
    })
    public void sum(int a, int b, int expected) {
        int actual = simpleMathAction.sum(a, b);
        assertEquals(expected, actual, "Wrong sum result");
    }

}
