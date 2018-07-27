package example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReporterTest {

    @Test
    void test() {
        Reporter sut = new Reporter();

        assertEquals("Hello!World!", sut.report());
    }
}
