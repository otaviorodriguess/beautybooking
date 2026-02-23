package com.otavio.beautybooking.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "agendamentos")
public class Agendamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nomeCliente;

    private String servico;

    private LocalDateTime dataHora;

    public Agendamento() {
    }

    public Agendamento(Long id, String nomeCliente, String servico, LocalDateTime dataHora) {
        this.id = id;
        this.nomeCliente = nomeCliente;
        this.servico = servico;
        this.dataHora = dataHora;
    }

    public Long getId() {
        return id;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getServico() {
        return servico;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public void setServico(String servico) {
        this.servico = servico;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }
}