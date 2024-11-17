package com.github.youssfbr.screenmatch_frases.services;

import com.github.youssfbr.screenmatch_frases.dtos.FraseResponseDTO;
import com.github.youssfbr.screenmatch_frases.repositories.IFraseRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FraseService implements IFraseService {

    private final IFraseRepository fraseRepository;

    public FraseService(IFraseRepository fraseRepository) {
        this.fraseRepository = fraseRepository;
    }

    @Override
    @Transactional(readOnly = true)
    public FraseResponseDTO obterFraseAleatoria() {
        return new FraseResponseDTO(fraseRepository.buscaFraseAleatoria());
    }
}
