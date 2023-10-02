package br.com.andremeiras.drogaria.domain;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public record Produto(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        Short codigo,

        @Column(length = 50, nullable = false, unique = true)
        String nome,

        @Column(nullable = false)
        Byte quantidade,

        @Column(nullable = false, precision = 5, scale = 2)
        BigDecimal preco,

        @Column
        LocalDate dataValidade) {
        // outras implementações
}
