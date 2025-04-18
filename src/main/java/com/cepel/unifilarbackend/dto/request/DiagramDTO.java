package com.cepel.unifilarbackend.dto.request;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.List;
import java.util.Objects;

@XmlRootElement
public class DiagramDTO {

    @XmlElementWrapper(name = "components")
    @XmlElement(name = "item")
    private List<ComponentDTO> components;

    @XmlElementWrapper(name = "connections")
    @XmlElement(name = "item")
    private List<ConnectionDTO> connections;

    public DiagramDTO() {
    }

    public DiagramDTO(List<ComponentDTO> components, List<ConnectionDTO> connections) {
        this.components = components;
        this.connections = connections;
    }

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

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        DiagramDTO that = (DiagramDTO) o;
        return Objects.equals(components, that.components) && Objects.equals(connections, that.connections);
    }

    @Override
    public int hashCode() {
        return Objects.hash(components, connections);
    }
}
