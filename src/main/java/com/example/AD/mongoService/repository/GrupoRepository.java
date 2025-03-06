package com.example.AD.mongoService.repository;

import com.example.AD.mongoService.model.entity.Grupo;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GrupoRepository extends MongoRepository<Grupo, String> {

    List<Grupo> findByid(String id);

    void deleteByid(String id);
}
