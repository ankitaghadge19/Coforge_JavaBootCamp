import TestCases.Calculator.Calculator;
import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CalculatorTC {
    private static Calculator calculator;

    @BeforeAll
    public static void setUpClass() {
        System.out.println("This is @BeforeAll annotation - Runs once before all test methods.");
        calculator = new Calculator();
    }

    @BeforeEach
    public void setUp() {
        System.out.println("This is @BeforeEach annotation - Runs before each test method.");
    }

    @Test
    @Order(1)
    public void testAddition() {
        System.out.println("Running Addition Test");
        int result = calculator.add(4, 5);
        Assertions.assertEquals(9, result);
        System.out.println("Addition Result: " + result);
    }

//    @Test     //Here order doesnt matter only @Test matters on which method it is annotated is get executed
    @Order(2)
    public void testSubtraction() {
        System.out.println("Running Subtraction Test");
        int result = calculator.subtract(7, 2);
        Assertions.assertEquals(5, result);
        System.out.println("Subtraction Result: " + result);
    }

    @Test
    @Order(3)
    public void testMultiplication() {
        System.out.println("Running Multiplication Test");
        int result = calculator.multiply(3, 4);
        Assertions.assertEquals(12, result);
        System.out.println("Multiplication Result: " + result);
    }

    @Test
    @Order(4)
    public void testDivision() {
        System.out.println("Running Division Test");
        int result = calculator.divide(8, 2);
        Assertions.assertEquals(4, result);
        System.out.println("Division Result: " + result);
    }

    @Test
    @Order(5)
    public void testDivisionByZero() {
        System.out.println("Running Division by Zero Test");
        Assertions.assertThrows(ArithmeticException.class, () -> {
            calculator.divide(8, 0);
        });
        System.out.println("Division by Zero Test Passed");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("This is @AfterEach annotation - Runs after each test method.");
    }

    @AfterAll
    public static void tearDownClass() {
        System.out.println("This is @AfterAll annotation - Runs once after all test methods.");
    }
}
