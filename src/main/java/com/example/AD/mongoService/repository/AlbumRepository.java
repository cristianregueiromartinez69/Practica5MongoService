package com.example.AD.mongoService.repository;

import com.example.AD.mongoService.model.entity.Album;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AlbumRepository extends MongoRepository<Album, String> {
}
