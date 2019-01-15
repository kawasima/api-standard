package net.unit8.apistandard.sort;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static net.unit8.apistandard.sort.SortField.Direction.ASC;
import static net.unit8.apistandard.sort.SortField.Direction.DESC;
import static org.assertj.core.api.Assertions.assertThat;

public class SortParserTest {
    private SortParser parser;

    @BeforeEach
    public void setup() {
        parser = new SortParser();
    }

    @Test
    public void test() {
        assertThat(parser.parse("+a,-b,c"))
                .containsExactly(
                        new SortField("a", ASC),
                        new SortField("b", DESC),
                        new SortField("c", ASC)
                );
    }

    @Test
    public void trim() {
        assertThat(parser.parse("+a , +b , +c "))
                .containsExactly(
                        new SortField("a", ASC),
                        new SortField("b", ASC),
                        new SortField("c", ASC)
                );
    }

    @Test
    public void illegalArgument() {
        Assertions.assertThatThrownBy(() -> {
            parser.parse("+a+b");
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
