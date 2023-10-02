package br.com.andremeiras.drogaria.repository;

import br.com.andremeiras.drogaria.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Short> {
}
