package br.com.murielmagno.beerApi.repository;

import br.com.murielmagno.beerApi.entity.Beer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BeerRepository extends JpaRepository<Beer, Long> {

    Optional<Beer> findByName(String nome);
}
