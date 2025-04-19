package com.cepel.unifilarbackend.service;

import com.cepel.unifilarbackend.entity.Component;
import com.cepel.unifilarbackend.entity.Diagram;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;

@Service
public class DiagramService {

    public Diagram filterHiddenItems(Diagram request) {
        Diagram response = new Diagram();
        response.setComponents(request.getComponents().stream().filter(component -> component.getHidden() != null && !component.getHidden()).toList());
        Set<String> ids = response.getComponents().stream().map(Component::getId).collect(Collectors.toSet());
        response.setConnections(request.getConnections().stream().filter(
                connection -> ids.contains(connection.getSource()) && ids.contains(connection.getTarget()))
                .toList());
        return response;
    }
}
