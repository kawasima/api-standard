package net.unit8.apistandard.resourcefilter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ResourceField {
    private String name;
    private List<ResourceField> children;

    public ResourceField(String name) {
        this.name = name;
    }

    public void addChild(ResourceField child) {
        if (children == null) {
            children = new ArrayList<>();
        }
        children.add(child);
    }

    public ResourceField lastChild() {
        if (children == null || children.isEmpty()) return null;
        return children.get(children.size() - 1);
    }

    public List<ResourceField> getChildren() {
        return (children == null) ? Collections.emptyList() : children;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        if (children != null && !children.isEmpty()) {
            sb.append(children.toString());
        }
        return sb.toString();
    }
}
