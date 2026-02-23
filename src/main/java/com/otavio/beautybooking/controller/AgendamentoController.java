package com.otavio.beautybooking.controller;

import com.otavio.beautybooking.model.Agendamento;
import com.otavio.beautybooking.service.AgendamentoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agendamentos")
public class AgendamentoController {

    private final AgendamentoService service;

    public AgendamentoController(AgendamentoService service) {
        this.service = service;
    }

    @PostMapping
    public Agendamento criar(@RequestBody Agendamento agendamento) {
        return service.criar(agendamento);
    }

    @GetMapping
    public List<Agendamento> listar() {
        return service.listar();
    }
}