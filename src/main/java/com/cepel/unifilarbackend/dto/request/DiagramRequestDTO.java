package com.cepel.unifilarbackend.dto.request;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.List;
import java.util.Objects;

@XmlRootElement
public class DiagramRequestDTO {

    @XmlElementWrapper(name = "components")
    @XmlElement(name = "item")
    private List<ComponentRequestDTO> components;

    @XmlElementWrapper(name = "connections")
    @XmlElement(name = "item")
    private List<ConnectionRequestDTO> connections;

    public DiagramRequestDTO() {
    }

    public DiagramRequestDTO(List<ComponentRequestDTO> components, List<ConnectionRequestDTO> connections) {
        this.components = components;
        this.connections = connections;
    }

    public List<ComponentRequestDTO> getComponents() {
        return components;
    }

    public void setComponents(List<ComponentRequestDTO> components) {
        this.components = components;
    }

    public List<ConnectionRequestDTO> getConnections() {
        return connections;
    }

    public void setConnections(List<ConnectionRequestDTO> connections) {
        this.connections = connections;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        DiagramRequestDTO that = (DiagramRequestDTO) o;
        return Objects.equals(components, that.components) && Objects.equals(connections, that.connections);
    }

    @Override
    public int hashCode() {
        return Objects.hash(components, connections);
    }
}
