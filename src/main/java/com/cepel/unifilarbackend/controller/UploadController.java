package com.cepel.unifilarbackend.controller;

import com.cepel.unifilarbackend.dto.request.DiagramRequestDTO;
import com.cepel.unifilarbackend.service.XMLParserService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UploadController {

    private final XMLParserService xmlParserService;

    public UploadController(XMLParserService xmlParserService) {
        this.xmlParserService = xmlParserService;
    }

    @PostMapping(path = "/upload", consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<DiagramRequestDTO> upload(@RequestBody DiagramRequestDTO request){
        return ResponseEntity.ok(request);
    }
}
