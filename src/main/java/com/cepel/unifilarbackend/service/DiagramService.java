package com.cepel.unifilarbackend.service;

import com.cepel.unifilarbackend.dto.DiagramDTO;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;
import org.springframework.stereotype.Service;

import java.io.StringReader;

@Service
public class DiagramService {

    public DiagramDTO parseXml(String request) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(DiagramDTO.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        return (DiagramDTO) unmarshaller.unmarshal(new StringReader(request));

    }
}
