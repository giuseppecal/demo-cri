package com.example.demo.service;

import com.example.demo.model.Links;
import com.example.demo.repository.LinksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LinkService {

    @Autowired
    private LinksRepository repository;

    public List<Links> getLinks(Integer id) {
        return repository.getLinks(id);
    }
}
