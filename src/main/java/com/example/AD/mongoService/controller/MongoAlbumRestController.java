package com.example.AD.mongoService.controller;

import com.example.AD.mongoService.model.dto.AlbumDTO;
import com.example.AD.mongoService.model.entity.Album;
import com.example.AD.mongoService.service.MongoAlbumService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Practica5MongoService/album")
public class MongoAlbumRestController {

    private final MongoAlbumService mongoAlbumService;

    public MongoAlbumRestController(MongoAlbumService mongoAlbumService) {
        this.mongoAlbumService = mongoAlbumService;
    }

    @PostMapping("/crear")
    public ResponseEntity<String> crearAlbumController(@RequestBody AlbumDTO albumDTO) {
        try{
            mongoAlbumService.crearAlbum(albumDTO);
        }catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
        return ResponseEntity.ok().body("Album creado correctamente");
    }

    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<String> borrarAlbumController(@PathVariable String id) {
        try{
            mongoAlbumService.deleteAlbumById(id);
        }catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
        return ResponseEntity.ok().body("Album borrado correctamente");
    }

    @GetMapping("/listar/{id}")
    public ResponseEntity<Album> getAlbumById(@PathVariable String id) {
        try{
            Album album = mongoAlbumService.getAlbumsById(id);
            return ResponseEntity.ok().body(album);
        }catch (Exception e){
            return ResponseEntity.badRequest().body(null);
        }
    }

    @GetMapping("/listar")
    public ResponseEntity<List<Album>> getAlbums() {
        try{
            List<Album> albumList = mongoAlbumService.getAllAlbums();
            return ResponseEntity.ok().body(albumList);
        }catch (Exception e){
            return ResponseEntity.badRequest().body(null);
        }
    }
}
