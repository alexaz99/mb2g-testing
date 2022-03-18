package guru.springframework;

import org.junit.jupiter.api.Test;

/**
 * Set in pom.xml
 */
class JavaHelloWorldTest {

    @Test
    void getHello() {

        System.out.println("#####################");
        System.out.println("Set TEST_HOST property in pom.xml: " + System.getenv("TEST_HOST"));
    }
}