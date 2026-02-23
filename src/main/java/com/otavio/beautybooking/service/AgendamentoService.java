package com.otavio.beautybooking.service;

import com.otavio.beautybooking.model.Agendamento;
import com.otavio.beautybooking.repository.AgendamentoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgendamentoService {

    private final AgendamentoRepository repository;

    public AgendamentoService(AgendamentoRepository repository) {
        this.repository = repository;
    }

    public Agendamento criar(Agendamento agendamento) {
        return repository.save(agendamento);
    }

    public List<Agendamento> listar() {
        return repository.findAll();
    }
}