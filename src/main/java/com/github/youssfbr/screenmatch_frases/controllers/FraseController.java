package com.github.youssfbr.screenmatch_frases.controllers;

import com.github.youssfbr.screenmatch_frases.dtos.FraseResponseDTO;
import com.github.youssfbr.screenmatch_frases.services.IFraseService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/series/frases")
public class FraseController {

    private final IFraseService fraseService;

    public FraseController(IFraseService fraseService) {
        this.fraseService = fraseService;
    }

    @GetMapping
    public ResponseEntity<FraseResponseDTO> obterFraseAleatoria() {
        return ResponseEntity.ok(fraseService.obterFraseAleatoria());
    }
}
