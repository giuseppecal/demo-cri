package com.example.demo.controller;

import com.example.demo.controller.io.GetElementsRequest;
import com.example.demo.model.Element;
import com.example.demo.model.Links;
import com.example.demo.service.ElementService;
import com.example.demo.service.LinkService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class ElementController {

    @Autowired
    private ElementService elementService;
    @Autowired
    private LinkService linksService;

    @GetMapping("/")
    private ModelAndView home() {
        List<String> types = elementService.getTypes();
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("types", types);
        return mv;
    }

    @PostMapping(value = "/elements", produces = "application/json")
    private String elementiByType(@RequestBody GetElementsRequest request) throws JsonProcessingException {
        List<Element> elements = elementService.getElementsByType(request.getType());
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(elements);
    }

    @GetMapping(value = "/element/{id}", produces = "application/json")
    private String elementiByType(@PathVariable("id") int id) throws JsonProcessingException {
        List<Links> links = linksService.getLinks(id);
        Element element = elementService.getElementById(id);
        element.getLinks().addAll(links);
        ObjectMapper mapper = new ObjectMapper();
        return mapper.writeValueAsString(element);
    }
}
