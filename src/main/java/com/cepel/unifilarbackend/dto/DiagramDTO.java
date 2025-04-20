package com.cepel.unifilarbackend.dto;

import jakarta.xml.bind.annotation.*;

import java.util.List;

@XmlRootElement(name = "root")
@XmlAccessorType(XmlAccessType.FIELD)
public class DiagramDTO {

    @XmlElementWrapper(name = "components")
    @XmlElement(name = "item")
    private List<ComponentDTO> components;

    @XmlElementWrapper(name = "connections")
    @XmlElement(name = "item")
    private List<ConnectionDTO> connections;

    public List<ComponentDTO> getComponents() {
        return components;
    }

    public void setComponents(List<ComponentDTO> components) {
        this.components = components;
    }

    public List<ConnectionDTO> getConnections() {
        return connections;
    }

    public void setConnections(List<ConnectionDTO> connections) {
        this.connections = connections;
    }
}
