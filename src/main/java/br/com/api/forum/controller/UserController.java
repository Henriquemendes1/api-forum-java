package br.com.api.forum.controller;

import br.com.api.forum.usuario.DadosCadastroUserDTO;
import br.com.api.forum.usuario.User;
import br.com.api.forum.usuario.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UserController {

    @Autowired
    private UserRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(DadosCadastroUserDTO dados){
        repository.save(new User(dados));
    }
}
