package net.unit8.apistandard.sort;

import java.io.Serializable;
import java.util.Objects;
import java.util.Optional;
import java.util.regex.Pattern;

public class SortField implements Serializable {
    private final String name;
    private final Direction direction;

    private static final Pattern NAME_PTN = Pattern.compile("^\\w+$");

    public SortField(String name, Direction direction) {
        if (name == null || name.isEmpty() || !NAME_PTN.matcher(name).matches())
            throw new IllegalArgumentException("name is required and \\w characters");
        if (direction == null)
            throw new IllegalArgumentException("direction is required");

        this.name = name;
        this.direction = direction;
    }

    public String getName() {
        return name;
    }

    public Direction getDirection() {
        return direction;
    }

    @Override
    public String toString() {
        return "SortField { name=" + name + ", direction=" + direction + " }";
    }

    @Override
    public boolean equals(Object another) {
        return Optional.ofNullable(another)
                .filter(SortField.class::isInstance)
                .map(SortField.class::cast)
                .filter(sf -> Objects.equals(name, sf.name)
                        && Objects.equals(direction, sf.direction))
                .isPresent();
    }

    public enum Direction {
        ASC,
        DESC
    }
}
