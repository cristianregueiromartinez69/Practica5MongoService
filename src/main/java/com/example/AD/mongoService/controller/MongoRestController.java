package com.example.AD.mongoService.controller;

import com.example.AD.mongoService.model.entity.Grupo;
import com.example.AD.mongoService.service.MongoService;
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

    public final MongoService mongoService;

    public MongoRestController(MongoService mongoService) {
        this.mongoService = mongoService;
    }

    @PostMapping("/crear")
    public ResponseEntity<String> crearDocumentoMongo(@RequestBody Grupo grupo) {
        try{
            mongoService.crearGrupo(grupo);
        }catch (Exception e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }
        return ResponseEntity.ok().body("Documento creado correctamente");
    }

    @GetMapping("/listar")
    public ResponseEntity<List<Grupo>> listarGruposMongo(){
        try{
            List<Grupo> grupoList = mongoService.getListGrupo();
            return ResponseEntity.ok().body(grupoList);
        }catch (Exception e){
            return ResponseEntity.badRequest().body(null);
        }
    }

}
