package com.github.youssfbr.screenmatch_frases.repositories;

import com.github.youssfbr.screenmatch_frases.models.Frase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IFraseRepository extends JpaRepository<Frase , Long> {

    @Query("""
            SELECT f FROM Frase f
            ORDER BY function('RANDOM') LIMIT 1""")
    Frase buscaFraseAleatoria();
}
