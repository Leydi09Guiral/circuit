package com.co.Guiral.leydi.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.co.Guiral.leydi.orquestador.GiraffeEnigmaOrchestrator;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/orques/steps")
public class GetStepOrquestadorController {

    @Autowired
    private GiraffeEnigmaOrchestrator orchestrator;

    @PostMapping("/orchestration")
    public Mono<ResponseEntity<String>> startOrchestration() {
        return orchestrator.solveEnigma()
                .map(ResponseEntity::ok); //se hace envio de respuesta final
    }
}