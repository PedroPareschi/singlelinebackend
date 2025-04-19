package com.cepel.unifilarbackend.entity;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlRootElement;

import java.util.List;

@XmlRootElement
public class Diagram {

    @XmlElementWrapper(name = "components")
    @XmlElement(name = "item")
    private List<Component> components;

    @XmlElementWrapper(name = "connections")
    @XmlElement(name = "item")
    private List<Connection> connections;

    public List<Component> getComponents() {
        return components;
    }

    public void setComponents(List<Component> components) {
        this.components = components;
    }

    public List<Connection> getConnections() {
        return connections;
    }

    public void setConnections(List<Connection> connections) {
        this.connections = connections;
    }
}
