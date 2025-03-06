package com.example.AD.mongoService.controller;

import com.example.AD.mongoService.model.dto.GrupoDTO;
import com.example.AD.mongoService.model.entity.Grupo;
import com.example.AD.mongoService.service.MongoGrupoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Practica5MongoService")
public class MongoRestController {

    public final MongoGrupoService mongoGrupoService;

    public MongoRestController(MongoGrupoService mongoGrupoService) {
        this.mongoGrupoService = mongoGrupoService;
    }

    @PostMapping("/crear")
    public ResponseEntity<String> crearDocumentoMongo(@RequestBody GrupoDTO grupoDTO) {
        try{

            mongoGrupoService.crearGrupo(grupoDTO);
        }catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
        return ResponseEntity.ok().body("Documento creado correctamente");
    }

    @GetMapping("/listar")
    public ResponseEntity<List<Grupo>> listarGruposMongo(){
        try{
            List<Grupo> grupoList = mongoGrupoService.getListGrupo();
            return ResponseEntity.ok().body(grupoList);
        }catch (Exception e){
            return ResponseEntity.badRequest().body(null);
        }
    }

    @GetMapping("/listar/{id}")
    public ResponseEntity<List<Grupo>> listarGruposMongoByID(@PathVariable String id){
        try{
            List<Grupo> grupoList = mongoGrupoService.getListGrupoById(id);
            return ResponseEntity.ok().body(grupoList);
        }catch (Exception e){
            return ResponseEntity.badRequest().body(null);
        }
    }

}
