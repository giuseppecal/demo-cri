package com.example.demo.repository;

import com.example.demo.model.Element;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ElementRepository extends JpaRepository<Element, Integer> {

    @Query("select distinct (e.type) from Element e")
    List<String> getTypes();

    @Query("select e from Element e where e.type = :type")
    List<Element> getElementsByType(@Param("type") String type);

    @Query("select e from Element e where e.type is null")
    List<Element> getElementsWithoutType();
}
