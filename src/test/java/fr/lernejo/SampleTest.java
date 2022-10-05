package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {
    private final Sample sample = new Sample();
    @Test
    void factorial() {
        int result = sample.fact(4);

        Assertions.assertThat(result)
            .as("4!")
            .isEqualTo(24);

    }
    @Test
    void throw_factorial() {
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
            .isThrownBy(() -> sample.fact(-3))
            .withMessage("N should be positive");
    }

    @Test
    void testOperationAdd(){
        int result = sample.op(Sample.Operation.ADD, 2, 3);

        Assertions.assertThat(result)
            .as("2+3")
            .isEqualTo(5);
    }
    @Test
    void testOperationMult(){
        int result = sample.op(Sample.Operation.MULT, 2, 3);

        Assertions.assertThat(result)
            .as("2+3")
            .isEqualTo(6);
    }

}
