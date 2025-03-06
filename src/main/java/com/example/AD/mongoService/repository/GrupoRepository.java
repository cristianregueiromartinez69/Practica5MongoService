package com.example.AD.mongoService.repository;

import com.example.AD.mongoService.model.entity.Grupo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GrupoRepository extends MongoRepository<Grupo, String> {

}
