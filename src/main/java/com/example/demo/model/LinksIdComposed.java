package com.example.demo.model;

import java.io.Serializable;
import java.util.Objects;

public class LinksIdComposed implements Serializable {

    private int element_ID1;
    private int element_ID2;
    private String direction;

    public LinksIdComposed(int element_ID1, int element_ID2, String direction) {
        this.element_ID1 = element_ID1;
        this.element_ID2 = element_ID2;
        this.direction = direction;
    }

    public LinksIdComposed() {
    }

    @Override
    public String toString() {
        return "LinksIdComposed{" +
                "element_ID1=" + element_ID1 +
                ", element_ID2=" + element_ID2 +
                ", direction='" + direction + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinksIdComposed that = (LinksIdComposed) o;
        return element_ID1 == that.element_ID1 &&
                element_ID2 == that.element_ID2 &&
                Objects.equals(direction, that.direction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(element_ID1, element_ID2, direction);
    }
}
