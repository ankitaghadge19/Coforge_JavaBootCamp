import TestCases.Calculator.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Addition {

    private final Calculator calculator=new Calculator();
    @Test
    void Addition()
    {
        assertEquals(3,calculator.add(2,1));
    }
}
