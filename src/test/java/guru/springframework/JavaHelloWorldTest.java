package guru.springframework;

import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class JavaHelloWorldTest {

    @Test
    void getHello() {
        JavaHelloWorld javaHelloWorld = new JavaHelloWorld();

        assertEquals("Hello World", javaHelloWorld.getHello());

        Supplier<String> messageSupplier  = () -> "Calculator.add(2, 2) test failed";
        assertTrue(1 < 2, messageSupplier);
    }
}