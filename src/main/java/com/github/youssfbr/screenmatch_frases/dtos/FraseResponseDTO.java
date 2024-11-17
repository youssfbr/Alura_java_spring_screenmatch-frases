package com.github.youssfbr.screenmatch_frases.dtos;

import com.github.youssfbr.screenmatch_frases.models.Frase;

public record FraseResponseDTO(
        String titulo ,
        String frase ,
        String personagem ,
        String poster
) {
    public FraseResponseDTO(Frase frase) {
        this(
            frase.getTitulo() ,
            frase.getFrase() ,
            frase.getPersonagem() ,
            frase.getPoster()
        );
    }
}
