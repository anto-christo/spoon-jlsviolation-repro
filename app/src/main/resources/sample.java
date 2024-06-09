package com.foo.bar;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Foo {
    private final List<? extends NodeInfo> items;

    public Bar(Collection<? extends NodeInfo> items) {
        this.items = new ArrayList<>(items);
    }
}
