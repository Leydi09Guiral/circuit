package com.co.Guiral.leydi.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/webhook")
public class WebhookController {

    @PostMapping("/receive")
    public void receiveWebhook() {
        System.out.println("El mensaje del orquestador fue recibido");
    }
}