package com.example.AD.mongoService.repository;

import com.example.AD.mongoService.model.entity.Album;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlbumRepository extends MongoRepository<Album, String> {

    Album findByid(String id);

}
