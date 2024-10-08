package com.co.Guiral.leydi.batch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import com.co.Guiral.leydi.orquestador.GiraffeEnigmaOrchestrator;

import reactor.core.publisher.Mono;

@Service
public class OrchestratorBatchService {
    @Autowired
    private GiraffeEnigmaOrchestrator orchestrator;


    @Scheduled(fixedRate = 120000)
    public void executeBatch() {
        Mono<String> result = orchestrator.solveEnigma(); //se hace el llamado al orquestador
        result.subscribe(response -> System.out.println("Batch result: " + response));
    }
}
