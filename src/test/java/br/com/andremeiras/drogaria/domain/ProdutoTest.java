package br.com.andremeiras.drogaria.domain;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProdutoTest {

    @Test
    public void criar() {

        Produto p = new Produto(
                Short.valueOf("1"),
                "Coca-cola",
                Byte.valueOf("15"),
                new BigDecimal("10.50"),
                null,
                null
        );
        System.out.println(p);
    }

}