package br.com.alura.linguamgens.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LinguagemController {

    @Autowired
    private LinguagemRepository repositorio;
    
    @GetMapping("/listagens")
    public List<Linguagem> listaliguagens(){
        List<Linguagem> linguagens = repositorio.findAll();
        return linguagens;
    }
    @PostMapping("/listagens")
    public Linguagem cadastroLinguagem(@RequestBody Linguagem linguagem){
        Linguagem liguagemSalva = repositorio.save(linguagem);
        return liguagemSalva;

    }
        

}
