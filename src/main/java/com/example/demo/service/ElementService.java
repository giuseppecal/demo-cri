package com.example.demo.service;

import com.example.demo.model.Element;
import com.example.demo.repository.ElementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ElementService {

    @Autowired
    private ElementRepository repository;

    public List<Element> getElementsByType(String type) {
        List<Element> elements = null;
        if (notAvailable(type)) {
            elements = repository.getElementsWithoutType();
        } else {
            elements = repository.getElementsByType(type);
        }
        return elements;
    }

    private boolean notAvailable(String type) {
        return type.equalsIgnoreCase("NOT AVAILABLE");
    }

    public List<String> getTypes() {
        List<String> types = repository.getTypes().stream().map(
                type -> {
                    return type == null ? "NOT AVAILABLE" : type;
                }
        ).collect(Collectors.toList());
        return types;
    }

    public Element getElementById(int id) {
        Optional<Element> element = repository.findById(new Integer(id));
        return element.isPresent() ? element.get() : null;
    }
}
