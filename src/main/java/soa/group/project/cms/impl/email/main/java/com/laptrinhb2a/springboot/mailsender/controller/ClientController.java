package com.laptrinhb2a.springboot.mailsender.controller;

import com.laptrinhb2a.springboot.mailsender.service.sdi.ClientSdi;
import com.laptrinhb2a.springboot.mailsender.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("/client")
public class ClientController {
    @Autowired
    private ClientService clientService;

    @PostMapping(value = "create")
    public ResponseEntity<Boolean> create(
            @RequestBody ClientSdi sdi
    ) {
        return ResponseEntity.ok(clientService.create(sdi));
    }
}