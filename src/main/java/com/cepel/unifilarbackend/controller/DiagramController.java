package com.cepel.unifilarbackend.controller;

import com.cepel.unifilarbackend.dto.DiagramDTO;
import com.cepel.unifilarbackend.dto.ErrorDTO;
import com.cepel.unifilarbackend.service.DiagramService;
import jakarta.xml.bind.JAXBException;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.StandardCharsets;

@RestController
public class DiagramController {

    private final DiagramService diagramService;

    public DiagramController(DiagramService diagramService) {
        this.diagramService = diagramService;
    }

    @PostMapping(path = "/upload", consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> upload(@RequestBody String request) {
        DiagramDTO response;
        try {
            response = diagramService.parseXml(request);
        } catch (JAXBException e) {
            return ResponseEntity.badRequest().body(new ErrorDTO(e.getMessage()));
        }
        return ResponseEntity.ok(response);
    }

    @PostMapping(path = "/download",consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<byte[]> download(@RequestBody String json){
        byte[] bytes = json.getBytes(StandardCharsets.UTF_8);
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setContentDisposition(ContentDisposition
                .attachment()
                .filename("diagrama_unifilar.json")
                .build());
        return new ResponseEntity<>(bytes, headers, HttpStatus.OK);
    }
}
