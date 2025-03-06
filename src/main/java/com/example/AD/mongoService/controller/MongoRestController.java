package com.example.AD.mongoService.controller;

import com.example.AD.mongoService.model.dto.GrupoDTO;
import com.example.AD.mongoService.model.entity.Grupo;
import com.example.AD.mongoService.service.MongoGrupoService;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mongoService")
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

}
