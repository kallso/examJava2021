import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestJUnitConfiguration {
    protected static Configuration config;

    @BeforeAll
    static void setUp() {
        String[] args = "-K 10 -A .90 -K 20 -P -K 30 -C".split("\\s+");
        config = CLIClassique.configuration(args);
    }

    @Test
    void testerAlpha() {
        assertEquals(0.9, config.getAlpha());
    }

    @Test
    void testerEpsilon() {
        assertEquals(-1.0, config.getEpsilon());
    }

    @Test
    void testerIndice() {
        assertEquals(30, config.getIndice());
    }

    @Test
    void testerMode() {
        assertEquals(Mode.CREUSE, config.getMode());
    }

}
