package com.example.AD.mongoService.service;

import com.example.AD.mongoService.repository.AlbumRepository;
import com.example.AD.mongoService.repository.GrupoRepository;
import org.springframework.stereotype.Service;

@Service
public class MongoAlbumService {

    private final AlbumRepository albumRepository;
    private final GrupoRepository grupoRepository;

    public MongoAlbumService(AlbumRepository albumRepository, GrupoRepository grupoRepository) {
        this.albumRepository = albumRepository;
        this.grupoRepository = grupoRepository;
    }


}
