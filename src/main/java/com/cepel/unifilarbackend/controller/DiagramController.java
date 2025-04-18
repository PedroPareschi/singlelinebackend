package com.cepel.unifilarbackend.controller;

import com.cepel.unifilarbackend.dto.request.DiagramDTO;
import com.cepel.unifilarbackend.service.DiagramService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiagramController {

    private final DiagramService diagramService;

    public DiagramController(DiagramService diagramService) {
        this.diagramService = diagramService;
    }

    @PostMapping(path = "/upload", consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DiagramDTO> upload(@RequestBody DiagramDTO request){
        return ResponseEntity.ok(request);
    }
}
