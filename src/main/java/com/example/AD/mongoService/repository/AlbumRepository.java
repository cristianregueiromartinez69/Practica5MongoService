package com.example.AD.mongoService.repository;

import com.example.AD.mongoService.model.entity.Album;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Repositorio de la clase de albumes
 * @author cristian
 * @version 1.0
 */
@Repository
public interface AlbumRepository extends MongoRepository<Album, String> {

    //busqueda de album por id
    Album findByid(String id);

}
