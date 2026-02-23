package com.otavio.beautybooking.repository;

import com.otavio.beautybooking.model.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long> {
}