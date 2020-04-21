package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="links")
@IdClass(LinksIdComposed.class)
public class Links {

    @Id
    private int element_ID1;
    @Id
    private int element_ID2;
    @Id
    private String direction;

    public int getElement_ID1() {
        return element_ID1;
    }

    public void setElement_ID1(int element_ID1) {
        this.element_ID1 = element_ID1;
    }

    public int getElement_ID2() {
        return element_ID2;
    }

    public void setElement_ID2(int element_ID2) {
        this.element_ID2 = element_ID2;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }
}
