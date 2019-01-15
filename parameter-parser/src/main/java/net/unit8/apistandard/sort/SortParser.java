package net.unit8.apistandard.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static net.unit8.apistandard.sort.SortField.Direction.*;

public class SortParser {
    public List<SortField> parse(String sortParameter) {
        if (sortParameter == null || sortParameter.isEmpty()) {
            return Collections.emptyList();
        }

        return Arrays.stream(sortParameter.split(","))
                .map(String::trim)
                .filter(s -> !s.isEmpty())
                .map(name -> {
                    if (name.startsWith("+")) {
                        return Optional.of(name.substring(1))
                                .filter(s -> !s.isEmpty())
                                .map(n -> new SortField(n, ASC))
                                .orElseThrow(() -> new IllegalArgumentException(name));
                    } else if (name.startsWith("-")) {
                        return Optional.of(name.substring(1))
                                .filter(s -> !s.isEmpty())
                                .map(n -> new SortField(n, DESC))
                                .orElseThrow(() -> new IllegalArgumentException(name));
                    } else {
                        return new SortField(name, ASC);
                    }
                })
                .collect(Collectors.toList());

    }
}
