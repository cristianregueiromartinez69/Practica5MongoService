package com.example.AD.mongoService.service;

import com.example.AD.mongoService.model.entity.Grupo;
import com.example.AD.mongoService.repository.AlbumRepository;
import com.example.AD.mongoService.repository.GrupoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MongoService {

    public final GrupoRepository grupoRepository;
    public final AlbumRepository albumRepository;

    public MongoService(GrupoRepository grupoRepository, AlbumRepository albumRepository) {
        this.grupoRepository = grupoRepository;
        this.albumRepository = albumRepository;
    }

    public void crearGrupo(Grupo grupo){
        grupoRepository.save(grupo);
    }

    public List<Grupo> getListGrupo(){
        return grupoRepository.findAll();
    }
}
