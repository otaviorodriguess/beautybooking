package com.otavio.beautybooking.controller;

import com.otavio.beautybooking.model.Profissional;
import com.otavio.beautybooking.repository.ProfissionalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profissionais")
@RequiredArgsConstructor
public class ProfissionalController {

    private final ProfissionalRepository repository;

    @PostMapping
    public Profissional criar(@RequestBody Profissional profissional) {
        return repository.save(profissional);
    }

    @GetMapping
    public List<Profissional> listar() {
        return repository.findAll();
    }
}