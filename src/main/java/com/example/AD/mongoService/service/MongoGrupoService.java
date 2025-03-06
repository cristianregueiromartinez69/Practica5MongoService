package com.example.AD.mongoService.service;

import com.example.AD.mongoService.model.dto.GrupoDTO;
import com.example.AD.mongoService.model.entity.Grupo;
import com.example.AD.mongoService.repository.GrupoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MongoGrupoService {

    public final GrupoRepository grupoRepository;

    public MongoGrupoService(GrupoRepository grupoRepository) {
        this.grupoRepository = grupoRepository;
    }

    public void crearGrupo(GrupoDTO grupoDTO) {
        Grupo grupo = new Grupo(grupoDTO.getNome(),
                grupoDTO.getXenero(), grupoDTO.getDataFormacion());
        grupoRepository.save(grupo);

    }

    public List<Grupo> getListGrupo(){
        return grupoRepository.findAll();
    }

    public List<Grupo> getListGrupoById(String id){
        return grupoRepository.findByid(id);
    }

    public void deleteByIdService(String id){
        grupoRepository.deleteById(id);
    }

    public void updateByIdService(String id, GrupoDTO grupoDTO){
        Grupo grupo = new Grupo(grupoDTO.getNome(), grupoDTO.getXenero(), grupoDTO.getDataFormacion());
        grupoRepository.updateByid(id, grupo);
    }
}
