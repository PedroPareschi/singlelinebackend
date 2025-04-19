package com.cepel.unifilarbackend.service;

import com.cepel.unifilarbackend.dto.ComponentDTO;
import com.cepel.unifilarbackend.dto.DiagramDTO;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class DiagramService {

    public DiagramDTO filterHiddenItems(DiagramDTO request) {
        DiagramDTO response = new DiagramDTO();
        response.setComponents(request.getComponents().stream().filter(component -> component.isHidden() != null && !component.isHidden()).toList());
        Set<String> ids = response.getComponents().stream().map(ComponentDTO::getId).collect(Collectors.toSet());
        response.setConnections(request.getConnections().stream().filter(
                connection -> ids.contains(connection.getSource()) && ids.contains(connection.getTarget()))
                .toList());
        return response;
    }
}
