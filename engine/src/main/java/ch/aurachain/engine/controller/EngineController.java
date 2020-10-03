package ch.aurachain.engine.controller;

import ch.aurachain.engine.repository.entity.AuditEntity;
import ch.aurachain.engine.service.EngineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/engine/api")
@RestController
public class EngineController {

    @Autowired
    private EngineService engineService;

    @GetMapping
    public String getStatus(){
        return "MERGE";
    }

    @GetMapping("/all")
    public List<AuditEntity> getAll(){
       return engineService.getAll();
    }

    @PostMapping("/{number}")
    public void insert(@PathVariable("number")Integer number){
        engineService.insert(number);
    }
}
