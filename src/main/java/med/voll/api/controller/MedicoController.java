package med.voll.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import med.voll.api.entities.medico.Medico;

@RestController
@RequestMapping ("medicos")
public class MedicoController {
    
    @PostMapping
    public void cadastrar(@RequestBody Medico dados){
        System.out.println(dados);
    }
}
