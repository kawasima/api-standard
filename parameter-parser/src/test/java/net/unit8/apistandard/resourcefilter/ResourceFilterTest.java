package net.unit8.apistandard.resourcefilter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ResourceFilterTest {
    ResourceFilter resourceFilter;

    @BeforeEach
    public void setup() {
        resourceFilter = new ResourceFilter();
    }

    @Test
    public void testNull() {
        assertThat(resourceFilter.parse(null)).isEmpty();
    }
    @Test
    public void testEmptyString() {
        assertThat(resourceFilter.parse("")).isEmpty();
    }

    @Test
    public void testCorruption() {
        ResourceField a = new ResourceField("a");
        ResourceField b = new ResourceField("b");
        b.addChild(new ResourceField("c"));
        ResourceField d = new ResourceField("d");
        assertThat(resourceFilter.parse("(a,b(c),d")).containsExactly(
                a, b, d
        );
    }

    @Test
    public void testNested() {
        ResourceField a = new ResourceField("a");
        ResourceField b = new ResourceField("b");
        b.addChild(new ResourceField("c"));
        ResourceField d = new ResourceField("d");
        assertThat(resourceFilter.parse("(a,b(c),d)")).containsExactly(
                a, b, d
        );
    }

    @Test
    public void testIllegalFormat() {
        assertThat(resourceFilter.parse("abcd")).isEmpty();
    }
}
