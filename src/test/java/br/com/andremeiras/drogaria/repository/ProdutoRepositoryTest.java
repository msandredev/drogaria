package br.com.andremeiras.drogaria.repository;

import br.com.andremeiras.drogaria.domain.Produto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.time.LocalDate;

@SpringBootTest
class ProdutoRepositoryTest {

    @Autowired
    private ProdutoRepository produtoRepository;

    @Test
    void inserir() {
        Produto p1 = new Produto(
                null,
                "Coca-cola",
                Byte.valueOf("15"),
                new BigDecimal("10.50"),
                LocalDate.of(2019, 8, 22)
        );

        Produto p2 = new Produto(
                null,
                "Guaraná Kuat",
                Byte.valueOf("12"),
                new BigDecimal("8.50"),
                LocalDate.of(2018, 9, 3)
        );
        produtoRepository.save(p1);
        produtoRepository.save(p2);
    }
}