package com.example.demo.repository;

import com.example.demo.model.Links;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LinksRepository extends JpaRepository<Links, Integer> {

    @Query("select l from Element e, Links l where e.id = l.element_ID1 and l.element_ID1= :id")
    List<Links> getLinks(@Param("id") Integer id);
}
