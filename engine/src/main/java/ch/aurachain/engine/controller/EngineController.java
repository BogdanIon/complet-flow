package ch.aurachain.engine.controller;

import ch.aurachain.engine.service.EngineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api")
@RestController
public class EngineController {

    @Autowired
    private EngineService engineService;

    @GetMapping
    public String getStatus(){
        return "HELLO";
    }

    @GetMapping("/all")
    public List<Integer> getAll(){
       return engineService.getAll();
    }

    @PostMapping("/{number}")
    public Integer insert(@PathVariable("number")Integer number){
        return engineService.insert(number);
    }
}
