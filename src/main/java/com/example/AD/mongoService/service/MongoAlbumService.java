package com.example.AD.mongoService.service;

import com.example.AD.mongoService.excepciones.IdExcepcion;
import com.example.AD.mongoService.model.dto.AlbumDTO;
import com.example.AD.mongoService.model.entity.Album;
import com.example.AD.mongoService.model.entity.Grupo;
import com.example.AD.mongoService.repository.AlbumRepository;
import com.example.AD.mongoService.repository.GrupoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MongoAlbumService {

    private final AlbumRepository albumRepository;
    private final GrupoRepository grupoRepository;

    public MongoAlbumService(AlbumRepository albumRepository, GrupoRepository grupoRepository) {
        this.albumRepository = albumRepository;
        this.grupoRepository = grupoRepository;
    }

    public void crearAlbum(AlbumDTO albumDTO) {
        if(!getIdGrupo(albumDTO.getGrupo_id())){
            throw new IdExcepcion("Este id no pertenece a un grupo");
        }
        else{
            Album album = new Album(albumDTO.getGrupo_id(), albumDTO.getTitulo(),
                    albumDTO.getData_lanzamento(), albumDTO.getPuntuacion());
            albumRepository.save(album);
        }
    }

    public void deleteAlbumById(String id) {
        albumRepository.deleteById(id);
    }

    public Album getAlbumsById(String id){
        return albumRepository.findByid(id);
    }

    public List<Album> getAllAlbums(){
        return albumRepository.findAll();
    }

    public void updateAlbumByIdService(String id, AlbumDTO albumDTO) {
        Album album = albumRepository.findByid(id);
        if(album != null){
            album.setTitulo(albumDTO.getTitulo());
            album.setData_lanzamento(albumDTO.getData_lanzamento());
            album.setPuntuacion(albumDTO.getPuntuacion());
            albumRepository.save(album);
        }
        else{
            throw new IdExcepcion("Este id no pertenece a un album");
        }
    }

    private boolean getIdGrupo(String id){
        List<Grupo> grupoList = grupoRepository.findAll();
        for (Grupo grupo : grupoList) {
            if(id.equals(grupo.getId())){
                return true;
            }
        }
        return false;
    }

}
