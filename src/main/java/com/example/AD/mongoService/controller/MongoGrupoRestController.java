package com.example.AD.mongoService.controller;

import com.example.AD.mongoService.model.dto.GrupoDTO;
import com.example.AD.mongoService.model.entity.Grupo;
import com.example.AD.mongoService.service.MongoGrupoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Practica5MongoService/grupo")
public class MongoGrupoRestController {

    public final MongoGrupoService mongoGrupoService;

    public MongoGrupoRestController(MongoGrupoService mongoGrupoService) {
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
    public ResponseEntity<Grupo> listarGruposMongoByID(@PathVariable String id){
        try{
            Grupo grupo = mongoGrupoService.getListGrupoById(id);
            return ResponseEntity.ok().body(grupo);
        }catch (Exception e){
            return ResponseEntity.badRequest().body(null);
        }
    }

    @DeleteMapping("/borrar/{id}")
    public ResponseEntity<String> borrarDocumentoMongo(@PathVariable String id){
        try{
            mongoGrupoService.deleteByIdService(id);
        }catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
        return ResponseEntity.ok().body("Documento eliminado correctamente");
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<String> actualizarDocumentoMongo(@PathVariable String id, @RequestBody GrupoDTO grupoDTO){
        try{
            mongoGrupoService.updateByIdService(id, grupoDTO);
        }catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
        return ResponseEntity.ok().body("Documento actualizado correctamente");
    }

}
